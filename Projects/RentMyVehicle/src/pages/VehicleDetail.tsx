import { useState, useEffect } from "react";
import { useParams, Link } from "react-router-dom";
import Navbar from "@/components/layout/Navbar";
import Footer from "@/components/layout/Footer";
import { Button } from "@/components/ui/button";
import { Input } from "@/components/ui/input";
import { Textarea } from "@/components/ui/textarea";
import { Badge } from "@/components/ui/badge";
import { Dialog, DialogContent, DialogHeader, DialogTitle, DialogTrigger } from "@/components/ui/dialog";
import { useToast } from "@/hooks/use-toast";
import { MapPin, Star, Clock, IndianRupee, Phone, Mail, User, Calendar, ArrowLeft, Heart, Share2, Shield, Check } from "lucide-react";
import { Helmet } from "react-helmet-async";

const [vehicleData, setVehicleData] = useState<any | null>(null);

useEffect(() => {
  if (!id) return;
  fetch(`/api/vehicles/${id}`)
    .then(res => {
      if (!res.ok) throw new Error('Not found');
      return res.json();
    })
    .then(data => setVehicleData(data))
    .catch(err => console.error('Failed to fetch vehicle', err));
}, [id]);

const VehicleDetail = () => {
  const { id } = useParams();
  const { toast } = useToast();
  const [selectedImage, setSelectedImage] = useState(0);
  const [bookingDialogOpen, setBookingDialogOpen] = useState(false);
  const [formData, setFormData] = useState({
    name: "",
    phone: "",
    address: "",
    startDate: "",
    endDate: "",
    message: "",
  });

  if (!vehicleData) {
    return (
      <div className="min-h-screen bg-background">
        <Navbar />
        <main className="pt-24 pb-16">
          <div className="container mx-auto px-4">Loading...</div>
        </main>
        <Footer />
      </div>
    );
  }

  const handleSubmitRequest = async () => {
    if (!formData.name || !formData.phone || !formData.startDate) {
      toast({
        title: "Missing Information",
        description: "Please fill in all required fields",
        variant: "destructive",
      });
      return;
    }

    try {
      const payload = {
        vehicle: vehicleData._id || vehicleData.id,
        userName: formData.name,
        phone: formData.phone,
        address: formData.address,
        startDate: formData.startDate,
        endDate: formData.endDate,
        message: formData.message,
      };

      const res = await fetch('/api/bookings', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(payload),
        credentials: 'include',
      });
      if (!res.ok) {
        const error = await res.json().catch(() => ({}));
        throw new Error(error?.error || 'Failed to create booking');
      }

      toast({
        title: "Request Sent!",
        description: "The owner will review your request and get back to you soon.",
      });
      setBookingDialogOpen(false);
      setFormData({ name: "", phone: "", address: "", startDate: "", endDate: "", message: "" });
    } catch (err) {
      console.error(err);
      toast({ title: 'Error', description: err.message || 'Could not send request', variant: 'destructive' });
    }
  };

  return (
    <>
      <Helmet>
        <title>{vehicleData.name} - RentWheels</title>
        <meta name="description" content={vehicleData.description} />
      </Helmet>
      <div className="min-h-screen bg-background">
        <Navbar />
        
        <main className="pt-24 pb-16">
          <div className="container mx-auto px-4">
            {/* Back Button */}
            <Link to="/browse" className="inline-flex items-center gap-2 text-muted-foreground hover:text-foreground mb-6 transition-colors">
              <ArrowLeft className="w-4 h-4" />
              Back to Browse
            </Link>

            <div className="grid lg:grid-cols-3 gap-8">
              {/* Left Column - Images & Details */}
              <div className="lg:col-span-2 space-y-6">
                {/* Main Image */}
                <div className="glass-card overflow-hidden">
                  <div className="relative aspect-video">
                    <img
                      src={vehicleData.images[selectedImage]}
                      alt={vehicleData.name}
                      className="w-full h-full object-cover"
                    />
                    <div className="absolute top-4 left-4 flex gap-2">
                      <Badge>{vehicleData.category}</Badge>
                      <Badge variant="secondary" className="bg-success/20 text-success">
                        {vehicleData.availability}
                      </Badge>
                    </div>
                    <div className="absolute top-4 right-4 flex gap-2">
                      <Button variant="glass" size="icon">
                        <Heart className="w-4 h-4" />
                      </Button>
                      <Button variant="glass" size="icon">
                        <Share2 className="w-4 h-4" />
                      </Button>
                    </div>
                  </div>
                  
                  {/* Thumbnails */}
                  <div className="flex gap-2 p-4">
                    {vehicleData.images.map((img, idx) => (
                      <button
                        key={idx}
                        onClick={() => setSelectedImage(idx)}
                        className={`w-20 h-14 rounded-lg overflow-hidden border-2 transition-all ${
                          selectedImage === idx ? "border-primary" : "border-transparent opacity-60 hover:opacity-100"
                        }`}
                      >
                        <img src={img} alt="" className="w-full h-full object-cover" />
                      </button>
                    ))}
                  </div>
                </div>

                {/* Details */}
                <div className="glass-card p-6 space-y-6">
                  <div>
                    <h1 className="text-2xl md:text-3xl font-bold text-foreground mb-2">{vehicleData.name}</h1>
                    <div className="flex flex-wrap items-center gap-4 text-muted-foreground">
                      <span className="flex items-center gap-1">
                        <MapPin className="w-4 h-4 text-primary" />
                        {vehicleData.location}
                      </span>
                      <span className="flex items-center gap-1">
                        <Star className="w-4 h-4 text-primary fill-primary" />
                        {vehicleData.rating} ({vehicleData.reviews} reviews)
                      </span>
                    </div>
                  </div>

                  <div>
                    <h2 className="font-semibold text-foreground mb-3">Description</h2>
                    <p className="text-muted-foreground">{vehicleData.description}</p>
                  </div>

                  <div>
                    <h2 className="font-semibold text-foreground mb-3">Features</h2>
                    <div className="flex flex-wrap gap-2">
                      {vehicleData.features.map((feature) => (
                        <Badge key={feature} variant="secondary" className="gap-1">
                          <Check className="w-3 h-3" />
                          {feature}
                        </Badge>
                      ))}
                    </div>
                  </div>
                </div>
              </div>

              {/* Right Column - Pricing & Owner */}
              <div className="space-y-6">
                {/* Pricing Card */}
                <div className="glass-card p-6 space-y-6">
                  <div className="space-y-2">
                    <div className="flex items-baseline gap-2">
                      <IndianRupee className="w-6 h-6 text-primary" />
                      <span className="text-4xl font-bold text-foreground">{vehicleData.hourlyRate}</span>
                      <span className="text-muted-foreground">/hour</span>
                    </div>
                    <div className="flex items-center gap-2 text-muted-foreground">
                      <Clock className="w-4 h-4" />
                      ₹{vehicleData.dailyRate}/day for long-term rentals
                    </div>
                  </div>

                  <Dialog open={bookingDialogOpen} onOpenChange={setBookingDialogOpen}>
                    <DialogTrigger asChild>
                      <Button size="lg" className="w-full">
                        Send Booking Request
                      </Button>
                    </DialogTrigger>
                    <DialogContent className="sm:max-w-md">
                      <DialogHeader>
                        <DialogTitle>Send Booking Request</DialogTitle>
                      </DialogHeader>
                      <div className="space-y-4 pt-4">
                        <div className="space-y-2">
                          <label className="text-sm font-medium">Your Name *</label>
                          <Input
                            placeholder="Enter your full name"
                            value={formData.name}
                            onChange={(e) => setFormData({ ...formData, name: e.target.value })}
                          />
                        </div>
                        <div className="space-y-2">
                          <label className="text-sm font-medium">Phone Number *</label>
                          <Input
                            placeholder="+91 98765 43210"
                            value={formData.phone}
                            onChange={(e) => setFormData({ ...formData, phone: e.target.value })}
                          />
                        </div>
                        <div className="space-y-2">
                          <label className="text-sm font-medium">Address / Pickup Location</label>
                          <Input
                            placeholder="Where do you need the vehicle?"
                            value={formData.address}
                            onChange={(e) => setFormData({ ...formData, address: e.target.value })}
                          />
                        </div>
                        <div className="grid grid-cols-2 gap-4">
                          <div className="space-y-2">
                            <label className="text-sm font-medium">Start Date *</label>
                            <Input
                              type="date"
                              value={formData.startDate}
                              onChange={(e) => setFormData({ ...formData, startDate: e.target.value })}
                            />
                          </div>
                          <div className="space-y-2">
                            <label className="text-sm font-medium">End Date</label>
                            <Input
                              type="date"
                              value={formData.endDate}
                              onChange={(e) => setFormData({ ...formData, endDate: e.target.value })}
                            />
                          </div>
                        </div>
                        <div className="space-y-2">
                          <label className="text-sm font-medium">Message to Owner</label>
                          <Textarea
                            placeholder="Any special requirements or questions..."
                            value={formData.message}
                            onChange={(e) => setFormData({ ...formData, message: e.target.value })}
                          />
                        </div>
                        <Button onClick={handleSubmitRequest} className="w-full">
                          Send Request
                        </Button>
                      </div>
                    </DialogContent>
                  </Dialog>

                  <p className="text-xs text-muted-foreground text-center">
                    You won't be charged yet. The owner will review and respond to your request.
                  </p>
                </div>

                {/* Owner Card */}
                <div className="glass-card p-6 space-y-4">
                  <div className="flex items-center gap-4">
                    <div className="w-14 h-14 rounded-full bg-primary/20 flex items-center justify-center">
                      <User className="w-7 h-7 text-primary" />
                    </div>
                    <div>
                      <div className="flex items-center gap-2">
                        <h3 className="font-semibold text-foreground">{vehicleData.owner.name}</h3>
                        {vehicleData.owner.verified && (
                          <Shield className="w-4 h-4 text-primary" />
                        )}
                      </div>
                      <p className="text-sm text-muted-foreground">
                        Member since {vehicleData.owner.joinedDate}
                      </p>
                    </div>
                  </div>

                  <div className="flex items-center justify-between text-sm">
                    <span className="text-muted-foreground">Total Vehicles</span>
                    <span className="text-foreground font-medium">{vehicleData.owner.totalVehicles}</span>
                  </div>

                  <div className="space-y-2 pt-2 border-t border-border">
                    <a href={`tel:${vehicleData.owner.phone}`} className="flex items-center gap-3 p-2 rounded-lg hover:bg-secondary transition-colors">
                      <Phone className="w-4 h-4 text-primary" />
                      <span className="text-sm text-foreground">{vehicleData.owner.phone}</span>
                    </a>
                    <a href={`mailto:${vehicleData.owner.email}`} className="flex items-center gap-3 p-2 rounded-lg hover:bg-secondary transition-colors">
                      <Mail className="w-4 h-4 text-primary" />
                      <span className="text-sm text-foreground">{vehicleData.owner.email}</span>
                    </a>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </main>

        <Footer />
      </div>
    </>
  );
};

export default VehicleDetail;
