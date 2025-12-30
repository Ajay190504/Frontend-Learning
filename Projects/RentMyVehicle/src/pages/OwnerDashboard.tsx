import { useState, useEffect } from "react";
import { Link } from "react-router-dom";
import Navbar from "@/components/layout/Navbar";
import Footer from "@/components/layout/Footer";
import { Button } from "@/components/ui/button";
import { Input } from "@/components/ui/input";
import { Textarea } from "@/components/ui/textarea";
import { Select, SelectContent, SelectItem, SelectTrigger, SelectValue } from "@/components/ui/select";
import { Tabs, TabsContent, TabsList, TabsTrigger } from "@/components/ui/tabs";
import { Badge } from "@/components/ui/badge";
import { Dialog, DialogContent, DialogHeader, DialogTitle, DialogTrigger } from "@/components/ui/dialog";
import { useToast } from "@/hooks/use-toast";
import { Car, Plus, MapPin, IndianRupee, Clock, Check, X, Eye, Phone, Mail, Calendar, User, Trash2, Edit } from "lucide-react";
import { Helmet } from "react-helmet-async";

const mockRequests = [
  { id: "1", vehicleName: "Toyota Innova Crysta", userName: "Rahul Sharma", userPhone: "+91 98765 43210", userAddress: "Andheri West, Mumbai", startDate: "2024-01-15", endDate: "2024-01-17", message: "Need for family trip to Lonavala", status: "pending" },
  { id: "2", vehicleName: "Honda City", userName: "Priya Patel", userPhone: "+91 87654 32109", userAddress: "Bandra, Mumbai", startDate: "2024-01-20", endDate: "2024-01-20", message: "Airport pickup", status: "accepted" },
  { id: "3", vehicleName: "Toyota Innova Crysta", userName: "Amit Kumar", userPhone: "+91 76543 21098", userAddress: "Powai, Mumbai", startDate: "2024-01-10", endDate: "2024-01-12", message: "Business travel", status: "rejected" },
];

const categories = ["Taxi", "Luxury", "Transport", "Infrastructure", "Bikes", "Buses"];
const OwnerDashboard = () => {
  const { toast } = useToast();
  const [vehicles, setVehicles] = useState([]);
  const [requests, setRequests] = useState(mockRequests);

  useEffect(() => {
    fetch('/api/vehicles')
      .then(res => res.json())
      .then(data => setVehicles(data))
      .catch(err => console.error('Failed to fetch vehicles', err));
  }, []);
  const [addVehicleOpen, setAddVehicleOpen] = useState(false);
  const [newVehicle, setNewVehicle] = useState({
    name: "",
    category: "",
    location: "",
    hourlyRate: "",
    dailyRate: "",
    description: "",
    imageFile: null,
  });

  const handleAddVehicle = async () => {
    if (!newVehicle.name || !newVehicle.category || !newVehicle.hourlyRate) {
      toast({ title: "Missing Information", description: "Please fill all required fields", variant: "destructive" });
      return;
    }

    try {
      const formData = new FormData();
      formData.append('name', newVehicle.name);
      formData.append('category', newVehicle.category);
      formData.append('location', newVehicle.location);
      formData.append('hourlyRate', newVehicle.hourlyRate.toString());
      if (newVehicle.dailyRate) formData.append('dailyRate', newVehicle.dailyRate.toString());
      if (newVehicle.description) formData.append('description', newVehicle.description);
      if (newVehicle.imageFile) formData.append('images', newVehicle.imageFile);

      const res = await fetch('/api/vehicles', {
        method: 'POST',
        body: formData,
        credentials: 'include',
      });
      if (!res.ok) throw new Error('Failed to add vehicle');
      const created = await res.json();
      setVehicles([created, ...vehicles]);
      setNewVehicle({ name: "", category: "", location: "", hourlyRate: "", dailyRate: "", description: "", imageFile: null });
      setAddVehicleOpen(false);
      toast({ title: "Vehicle Added", description: "Your vehicle has been listed successfully" });
    } catch (err) {
      console.error(err);
      toast({ title: "Error", description: "Could not add vehicle", variant: "destructive" });
    }
  };

  const handleRequest = (requestId: string, action: "accept" | "reject") => {
    setRequests(requests.map(req => 
      req.id === requestId ? { ...req, status: action === "accept" ? "accepted" : "rejected" } : req
    ));
    toast({
      title: action === "accept" ? "Request Accepted" : "Request Rejected",
      description: action === "accept" ? "The user has been notified" : "The request has been declined",
    });
  };

  const pendingRequests = requests.filter(r => r.status === "pending");

  return (
    <>
      <Helmet>
        <title>Owner Dashboard - RentWheels</title>
        <meta name="description" content="Manage your vehicle listings, view booking requests, and track your earnings on RentWheels." />
      </Helmet>
      <div className="min-h-screen bg-background">
        <Navbar />
        
        <main className="pt-24 pb-16">
          <div className="container mx-auto px-4">
            {/* Header */}
            <div className="flex flex-col sm:flex-row justify-between items-start sm:items-center gap-4 mb-8">
              <div>
                <h1 className="text-3xl font-bold text-foreground">Owner Dashboard</h1>
                <p className="text-muted-foreground">Manage your vehicles and booking requests</p>
              </div>
              <div className="flex gap-3">
                <Link to="/pricing">
                  <Button variant="outline">Subscription</Button>
                </Link>
                <Dialog open={addVehicleOpen} onOpenChange={setAddVehicleOpen}>
                  <DialogTrigger asChild>
                    <Button className="gap-2">
                      <Plus className="w-4 h-4" />
                      Add Vehicle
                    </Button>
                  </DialogTrigger>
                  <DialogContent className="sm:max-w-lg">
                    <DialogHeader>
                      <DialogTitle>Add New Vehicle</DialogTitle>
                    </DialogHeader>
                    <div className="space-y-4 pt-4">
                      <div className="space-y-2">
                        <label className="text-sm font-medium">Vehicle Name *</label>
                        <Input placeholder="e.g., Toyota Innova Crysta" value={newVehicle.name} onChange={(e) => setNewVehicle({ ...newVehicle, name: e.target.value })} />
                      </div>
                      <div className="grid grid-cols-2 gap-4">
                        <div className="space-y-2">
                          <label className="text-sm font-medium">Category *</label>
                          <Select value={newVehicle.category} onValueChange={(v) => setNewVehicle({ ...newVehicle, category: v })}>
                            <SelectTrigger><SelectValue placeholder="Select" /></SelectTrigger>
                            <SelectContent>
                              {categories.map(cat => <SelectItem key={cat} value={cat}>{cat}</SelectItem>)}
                            </SelectContent>
                          </Select>
                        </div>
                        <div className="space-y-2">
                          <label className="text-sm font-medium">Location</label>
                          <Input placeholder="City" value={newVehicle.location} onChange={(e) => setNewVehicle({ ...newVehicle, location: e.target.value })} />
                        </div>
                      </div>
                      <div className="grid grid-cols-2 gap-4">
                        <div className="space-y-2">
                          <label className="text-sm font-medium">Hourly Rate (₹) *</label>
                          <Input type="number" placeholder="150" value={newVehicle.hourlyRate} onChange={(e) => setNewVehicle({ ...newVehicle, hourlyRate: e.target.value })} />
                        </div>
                        <div className="space-y-2">
                          <label className="text-sm font-medium">Daily Rate (₹)</label>
                          <Input type="number" placeholder="2500" value={newVehicle.dailyRate} onChange={(e) => setNewVehicle({ ...newVehicle, dailyRate: e.target.value })} />
                        </div>
                      </div>
                      <div className="space-y-2">
                        <label className="text-sm font-medium">Upload Image</label>
                        <Input type="file" onChange={(e:any) => setNewVehicle({ ...newVehicle, imageFile: e.target.files?.[0] || null })} />
                      </div>
                      <div className="space-y-2">
                        <label className="text-sm font-medium">Description</label>
                        <Textarea placeholder="Describe your vehicle..." value={newVehicle.description} onChange={(e) => setNewVehicle({ ...newVehicle, description: e.target.value })} />
                      </div>
                      <Button onClick={handleAddVehicle} className="w-full">Add Vehicle</Button>
                    </div>
                  </DialogContent>
                </Dialog>
              </div>
            </div>

            {/* Stats */}
            <div className="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-4 gap-4 mb-8">
              {[
                { label: "Total Vehicles", value: vehicles.length, icon: Car },
                { label: "Pending Requests", value: pendingRequests.length, icon: Clock },
                { label: "Active Listings", value: vehicles.filter(v => v.status === "active").length, icon: Check },
                { label: "This Month Earnings", value: "₹12,500", icon: IndianRupee },
              ].map((stat) => (
                <div key={stat.label} className="glass-card p-4 flex items-center gap-4">
                  <div className="w-12 h-12 rounded-xl bg-primary/10 flex items-center justify-center">
                    <stat.icon className="w-6 h-6 text-primary" />
                  </div>
                  <div>
                    <div className="text-2xl font-bold text-foreground">{stat.value}</div>
                    <div className="text-sm text-muted-foreground">{stat.label}</div>
                  </div>
                </div>
              ))}
            </div>

            {/* Tabs */}
            <Tabs defaultValue="vehicles" className="space-y-6">
              <TabsList>
                <TabsTrigger value="vehicles">My Vehicles</TabsTrigger>
                <TabsTrigger value="requests" className="relative">
                  Requests
                  {pendingRequests.length > 0 && (
                    <span className="absolute -top-1 -right-1 w-5 h-5 rounded-full bg-primary text-primary-foreground text-xs flex items-center justify-center">
                      {pendingRequests.length}
                    </span>
                  )}
                </TabsTrigger>
              </TabsList>

              <TabsContent value="vehicles">
                {vehicles.length > 0 ? (
                  <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-6">
                    {vehicles.map((vehicle) => (
                      <div key={vehicle.id} className="glass-card overflow-hidden">
                        <div className="relative h-40">
                          <img src={(vehicle.images && vehicle.images.length > 0) ? vehicle.images[0] : vehicle.image} alt={vehicle.name} className="w-full h-full object-cover" />
                          <Badge className="absolute top-3 left-3">{vehicle.category}</Badge>
                        </div>
                        <div className="p-4 space-y-3">
                          <h3 className="font-semibold text-foreground">{vehicle.name}</h3>
                          <div className="flex items-center gap-2 text-sm text-muted-foreground">
                            <MapPin className="w-4 h-4" />
                            {vehicle.location}
                          </div>
                          <div className="flex items-center justify-between">
                            <span className="text-foreground font-medium">₹{vehicle.hourlyRate}/hr</span>
                            <div className="flex gap-2">
                              <Button variant="ghost" size="icon"><Edit className="w-4 h-4" /></Button>
                              <Button variant="ghost" size="icon" className="text-destructive"><Trash2 className="w-4 h-4" /></Button>
                            </div>
                          </div>
                        </div>
                      </div>
                    ))}
                  </div>
                ) : (
                  <div className="text-center py-16 glass-card">
                    <Car className="w-16 h-16 text-muted-foreground mx-auto mb-4" />
                    <h3 className="text-xl font-semibold text-foreground mb-2">No vehicles yet</h3>
                    <p className="text-muted-foreground mb-4">Add your first vehicle to start receiving bookings</p>
                    <Button onClick={() => setAddVehicleOpen(true)} className="gap-2">
                      <Plus className="w-4 h-4" />
                      Add Vehicle
                    </Button>
                  </div>
                )}
              </TabsContent>

              <TabsContent value="requests">
                {requests.length > 0 ? (
                  <div className="space-y-4">
                    {requests.map((request) => (
                      <div key={request.id} className="glass-card p-4 md:p-6">
                        <div className="flex flex-col lg:flex-row justify-between gap-4">
                          <div className="space-y-3">
                            <div className="flex items-center gap-3">
                              <h3 className="font-semibold text-foreground">{request.vehicleName}</h3>
                              <Badge variant={request.status === "pending" ? "secondary" : request.status === "accepted" ? "default" : "destructive"}>
                                {request.status}
                              </Badge>
                            </div>
                            <div className="grid grid-cols-1 sm:grid-cols-2 gap-3 text-sm">
                              <div className="flex items-center gap-2 text-muted-foreground">
                                <User className="w-4 h-4 text-primary" />
                                {request.userName}
                              </div>
                              <div className="flex items-center gap-2 text-muted-foreground">
                                <Phone className="w-4 h-4 text-primary" />
                                {request.userPhone}
                              </div>
                              <div className="flex items-center gap-2 text-muted-foreground">
                                <MapPin className="w-4 h-4 text-primary" />
                                {request.userAddress}
                              </div>
                              <div className="flex items-center gap-2 text-muted-foreground">
                                <Calendar className="w-4 h-4 text-primary" />
                                {request.startDate} → {request.endDate}
                              </div>
                            </div>
                            {request.message && (
                              <p className="text-sm text-muted-foreground bg-secondary/50 p-3 rounded-lg">
                                "{request.message}"
                              </p>
                            )}
                          </div>
                          {request.status === "pending" && (
                            <div className="flex lg:flex-col gap-2">
                              <Button size="sm" className="gap-1" onClick={() => handleRequest(request.id, "accept")}>
                                <Check className="w-4 h-4" />
                                Accept
                              </Button>
                              <Button size="sm" variant="outline" className="gap-1" onClick={() => handleRequest(request.id, "reject")}>
                                <X className="w-4 h-4" />
                                Reject
                              </Button>
                            </div>
                          )}
                        </div>
                      </div>
                    ))}
                  </div>
                ) : (
                  <div className="text-center py-16 glass-card">
                    <Clock className="w-16 h-16 text-muted-foreground mx-auto mb-4" />
                    <h3 className="text-xl font-semibold text-foreground mb-2">No requests yet</h3>
                    <p className="text-muted-foreground">Booking requests will appear here</p>
                  </div>
                )}
              </TabsContent>
            </Tabs>
          </div>
        </main>

        <Footer />
      </div>
    </>
  );
};

export default OwnerDashboard;
