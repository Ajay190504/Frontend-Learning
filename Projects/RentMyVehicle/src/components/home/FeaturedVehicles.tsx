import { ArrowRight } from "lucide-react";
import { Button } from "@/components/ui/button";
import VehicleCard from "@/components/vehicles/VehicleCard";
import { Link } from "react-router-dom";

import { useState, useEffect } from "react";

const FeaturedVehicles = () => {
  const [featuredVehicles, setFeaturedVehicles] = useState<any[]>([]);

  useEffect(() => {
    fetch('/api/vehicles')
      .then(res => res.json())
      .then(data => setFeaturedVehicles(data.slice(0, 4)))
      .catch(err => console.error('Failed to fetch featured vehicles', err));
  }, []);

  return (
    <section className="py-20 bg-card/30">
      <div className="container mx-auto px-4">
        {/* Header */}
        <div className="flex flex-col sm:flex-row justify-between items-start sm:items-center gap-4 mb-12">
          <div>
            <h2 className="text-3xl md:text-4xl font-bold text-foreground mb-2">
              Featured <span className="text-gradient">Vehicles</span>
            </h2>
            <p className="text-muted-foreground">
              Top-rated vehicles from verified owners
            </p>
          </div>
          <Link to="/browse">
            <Button variant="outline" className="gap-2">
              View All
              <ArrowRight className="w-4 h-4" />
            </Button>
          </Link>
        </div>

        {/* Vehicles Grid */}
        <div className="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-4 gap-6">
          {featuredVehicles.map((vehicle) => (
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
      </div>
    </section>
  );
};

export default FeaturedVehicles;
