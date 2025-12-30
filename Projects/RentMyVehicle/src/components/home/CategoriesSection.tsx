import { Car, Truck, Crown, Building2, Bike, Bus } from "lucide-react";
import CategoryCard from "@/components/vehicles/CategoryCard";

const categories = [
  {
    name: "Taxi & Cabs",
    description: "Daily commute and city travel",
    icon: Car,
    vehicleCount: 2500,
    href: "/browse?category=taxi",
    gradient: "linear-gradient(135deg, hsl(38 92% 50% / 0.3) 0%, hsl(38 92% 30% / 0.4) 100%)",
  },
  {
    name: "Luxury Vehicles",
    description: "Premium cars for special occasions",
    icon: Crown,
    vehicleCount: 800,
    href: "/browse?category=luxury",
    gradient: "linear-gradient(135deg, hsl(280 70% 50% / 0.3) 0%, hsl(280 70% 30% / 0.4) 100%)",
  },
  {
    name: "Transport Trucks",
    description: "Goods & logistics transportation",
    icon: Truck,
    vehicleCount: 1500,
    href: "/browse?category=transport",
    gradient: "linear-gradient(135deg, hsl(200 70% 50% / 0.3) 0%, hsl(200 70% 30% / 0.4) 100%)",
  },
  {
    name: "Infrastructure",
    description: "Heavy equipment for construction",
    icon: Building2,
    vehicleCount: 600,
    href: "/browse?category=infrastructure",
    gradient: "linear-gradient(135deg, hsl(340 70% 50% / 0.3) 0%, hsl(340 70% 30% / 0.4) 100%)",
  },
  {
    name: "Two Wheelers",
    description: "Bikes and scooters for quick rides",
    icon: Bike,
    vehicleCount: 3000,
    href: "/browse?category=bikes",
    gradient: "linear-gradient(135deg, hsl(150 70% 40% / 0.3) 0%, hsl(150 70% 25% / 0.4) 100%)",
  },
  {
    name: "Buses & Vans",
    description: "Group travel and events",
    icon: Bus,
    vehicleCount: 400,
    href: "/browse?category=buses",
    gradient: "linear-gradient(135deg, hsl(20 80% 50% / 0.3) 0%, hsl(20 80% 30% / 0.4) 100%)",
  },
];

const CategoriesSection = () => {
  return (
    <section className="py-20 relative">
      <div className="container mx-auto px-4">
        {/* Header */}
        <div className="text-center max-w-2xl mx-auto mb-12">
          <h2 className="text-3xl md:text-4xl font-bold text-foreground mb-4">
            Browse by <span className="text-gradient">Category</span>
          </h2>
          <p className="text-muted-foreground">
            Choose from a wide range of vehicle categories to match your specific needs
          </p>
        </div>

        {/* Categories Grid */}
        <div className="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-3 gap-6">
          {categories.map((category) => (
            <CategoryCard key={category.name} {...category} />
          ))}
        </div>
      </div>
    </section>
  );
};

export default CategoriesSection;
