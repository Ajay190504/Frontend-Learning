import { useState, useEffect } from "react";
import { useSearchParams } from "react-router-dom";
import Navbar from "@/components/layout/Navbar";
import Footer from "@/components/layout/Footer";
import VehicleCard from "@/components/vehicles/VehicleCard";
import { Button } from "@/components/ui/button";
import { Input } from "@/components/ui/input";
import { Select, SelectContent, SelectItem, SelectTrigger, SelectValue } from "@/components/ui/select";
import { Slider } from "@/components/ui/slider";
import { Search, MapPin, Filter, X, SlidersHorizontal } from "lucide-react";
import { Helmet } from "react-helmet-async";

// Fetch vehicles from API
const [vehicles, setVehicles] = useState<any[]>([]);

useEffect(() => {
  fetch('/api/vehicles')
    .then(res => res.json())
    .then(data => setVehicles(data))
    .catch(err => console.error('Failed to fetch vehicles', err));
}, []);

const categories = ["All", "Taxi", "Luxury", "Transport", "Infrastructure", "Bikes", "Buses"];
const locations = ["All Locations", "Mumbai", "Delhi", "Bangalore", "Chennai", "Pune", "Hyderabad", "Ahmedabad"];

const Browse = () => {
  const [searchParams] = useSearchParams();
  const initialCategory = searchParams.get("category") || "All";
  const initialLocation = searchParams.get("location") || "";

  const [searchQuery, setSearchQuery] = useState(initialLocation);
  const [selectedCategory, setSelectedCategory] = useState(initialCategory);
  const [selectedLocation, setSelectedLocation] = useState("All Locations");
  const [priceRange, setPriceRange] = useState([0, 2000]);
  const [showFilters, setShowFilters] = useState(false);

  const filteredVehicles = vehicles.filter((vehicle: any) => {
    const name = vehicle.name || '';
    const location = vehicle.location || '';
    const category = vehicle.category || '';
    const hourlyRate = vehicle.hourlyRate || 0;

    const matchesSearch = name.toLowerCase().includes(searchQuery.toLowerCase()) ||
      location.toLowerCase().includes(searchQuery.toLowerCase());
    const matchesCategory = selectedCategory === "All" || category.toLowerCase() === selectedCategory.toLowerCase();
    const matchesLocation = selectedLocation === "All Locations" || location.includes(selectedLocation);
    const matchesPrice = hourlyRate >= priceRange[0] && hourlyRate <= priceRange[1];
    return matchesSearch && matchesCategory && matchesLocation && matchesPrice;
  });

  return (
    <>
      <Helmet>
        <title>Browse Vehicles - RentWheels</title>
        <meta name="description" content="Browse and filter through thousands of vehicles. Find taxis, luxury cars, trucks, and more at the best rates." />
      </Helmet>
      <div className="min-h-screen bg-background">
        <Navbar />
        
        <main className="pt-24 pb-16">
          <div className="container mx-auto px-4">
            {/* Header */}
            <div className="mb-8">
              <h1 className="text-3xl md:text-4xl font-bold text-foreground mb-2">
                Browse <span className="text-gradient">Vehicles</span>
              </h1>
              <p className="text-muted-foreground">
                Find the perfect vehicle for your needs
              </p>
            </div>

            {/* Search & Filters */}
            <div className="glass-card p-4 mb-8">
              <div className="flex flex-col lg:flex-row gap-4">
                {/* Search Input */}
                <div className="flex-1 relative">
                  <Search className="absolute left-3 top-1/2 -translate-y-1/2 w-5 h-5 text-muted-foreground" />
                  <Input
                    type="text"
                    placeholder="Search vehicles or locations..."
                    className="pl-10 h-12 bg-secondary/50"
                    value={searchQuery}
                    onChange={(e) => setSearchQuery(e.target.value)}
                  />
                </div>

                {/* Category Filter */}
                <Select value={selectedCategory} onValueChange={setSelectedCategory}>
                  <SelectTrigger className="w-full lg:w-48 h-12 bg-secondary/50">
                    <SelectValue placeholder="Category" />
                  </SelectTrigger>
                  <SelectContent>
                    {categories.map((cat) => (
                      <SelectItem key={cat} value={cat}>{cat}</SelectItem>
                    ))}
                  </SelectContent>
                </Select>

                {/* Location Filter */}
                <Select value={selectedLocation} onValueChange={setSelectedLocation}>
                  <SelectTrigger className="w-full lg:w-48 h-12 bg-secondary/50">
                    <MapPin className="w-4 h-4 mr-2" />
                    <SelectValue placeholder="Location" />
                  </SelectTrigger>
                  <SelectContent>
                    {locations.map((loc) => (
                      <SelectItem key={loc} value={loc}>{loc}</SelectItem>
                    ))}
                  </SelectContent>
                </Select>

                {/* More Filters Toggle */}
                <Button
                  variant={showFilters ? "default" : "outline"}
                  className="h-12 gap-2"
                  onClick={() => setShowFilters(!showFilters)}
                >
                  <SlidersHorizontal className="w-4 h-4" />
                  Filters
                </Button>
              </div>

              {/* Expanded Filters */}
              {showFilters && (
                <div className="mt-4 pt-4 border-t border-border">
                  <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-4 gap-6">
                    <div className="space-y-3">
                      <label className="text-sm font-medium text-foreground">
                        Price Range (₹/hr): {priceRange[0]} - {priceRange[1]}
                      </label>
                      <Slider
                        value={priceRange}
                        onValueChange={setPriceRange}
                        max={2000}
                        step={50}
                        className="mt-2"
                      />
                    </div>
                  </div>
                </div>
              )}
            </div>

            {/* Results Count */}
            <div className="flex items-center justify-between mb-6">
              <p className="text-muted-foreground">
                Showing <span className="text-foreground font-medium">{filteredVehicles.length}</span> vehicles
              </p>
              {(selectedCategory !== "All" || selectedLocation !== "All Locations" || searchQuery) && (
                <Button
                  variant="ghost"
                  size="sm"
                  className="gap-2 text-muted-foreground"
                  onClick={() => {
                    setSearchQuery("");
                    setSelectedCategory("All");
                    setSelectedLocation("All Locations");
                    setPriceRange([0, 2000]);
                  }}
                >
                  <X className="w-4 h-4" />
                  Clear Filters
                </Button>
              )}
            </div>

            {/* Vehicles Grid */}
            {filteredVehicles.length > 0 ? (
              <div className="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-3 xl:grid-cols-4 gap-6">
                {filteredVehicles.map((vehicle: any) => (
                  <VehicleCard
                    key={vehicle._id || vehicle.id}
                    id={vehicle._id || vehicle.id}
                    name={vehicle.name}
                    images={vehicle.images}
                    image={vehicle.image}
                    category={vehicle.category}
                    location={vehicle.location}
                    hourlyRate={vehicle.hourlyRate}
                    dailyRate={vehicle.dailyRate}
                    rating={vehicle.rating || 0}
                    reviews={vehicle.reviews || 0}
                    ownerName={vehicle.owner?.name || vehicle.ownerName || 'Owner'}
                  />
                ))}
              </div>
            ) : (
              <div className="text-center py-16">
                <div className="w-24 h-24 rounded-full bg-secondary flex items-center justify-center mx-auto mb-4">
                  <Search className="w-10 h-10 text-muted-foreground" />
                </div>
                <h3 className="text-xl font-semibold text-foreground mb-2">No vehicles found</h3>
                <p className="text-muted-foreground">Try adjusting your search or filters</p>
              </div>
            )}
          </div>
        </main>

        <Footer />
      </div>
    </>
  );
};

export default Browse;
