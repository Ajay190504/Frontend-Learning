import Navbar from "@/components/layout/Navbar";
import Footer from "@/components/layout/Footer";
import CategoryCard from "@/components/vehicles/CategoryCard";
import { Car, Truck, Crown, Building2, Bike, Bus, Forklift, Ambulance } from "lucide-react";
import { Helmet } from "react-helmet-async";

const categories = [
  {
    name: "Taxi & Cabs",
    description: "Perfect for daily commutes, airport transfers, and city travel. Choose from sedans, SUVs, and hatchbacks.",
    icon: Car,
    vehicleCount: 2500,
    href: "/browse?category=taxi",
    gradient: "linear-gradient(135deg, hsl(38 92% 50% / 0.3) 0%, hsl(38 92% 30% / 0.4) 100%)",
  },
  {
    name: "Luxury Vehicles",
    description: "Premium cars for weddings, corporate events, and special occasions. Mercedes, BMW, Audi, and more.",
    icon: Crown,
    vehicleCount: 800,
    href: "/browse?category=luxury",
    gradient: "linear-gradient(135deg, hsl(280 70% 50% / 0.3) 0%, hsl(280 70% 30% / 0.4) 100%)",
  },
  {
    name: "Transport Trucks",
    description: "Heavy-duty trucks for goods transportation, logistics, and commercial purposes.",
    icon: Truck,
    vehicleCount: 1500,
    href: "/browse?category=transport",
    gradient: "linear-gradient(135deg, hsl(200 70% 50% / 0.3) 0%, hsl(200 70% 30% / 0.4) 100%)",
  },
  {
    name: "Infrastructure Equipment",
    description: "JCBs, cranes, excavators, and heavy machinery for construction and development projects.",
    icon: Building2,
    vehicleCount: 600,
    href: "/browse?category=infrastructure",
    gradient: "linear-gradient(135deg, hsl(340 70% 50% / 0.3) 0%, hsl(340 70% 30% / 0.4) 100%)",
  },
  {
    name: "Two Wheelers",
    description: "Bikes and scooters for quick city rides. Ideal for solo travelers and short distances.",
    icon: Bike,
    vehicleCount: 3000,
    href: "/browse?category=bikes",
    gradient: "linear-gradient(135deg, hsl(150 70% 40% / 0.3) 0%, hsl(150 70% 25% / 0.4) 100%)",
  },
  {
    name: "Buses & Tempo",
    description: "Mini buses, tempo travellers, and coaches for group travel, events, and pilgrimages.",
    icon: Bus,
    vehicleCount: 400,
    href: "/browse?category=buses",
    gradient: "linear-gradient(135deg, hsl(20 80% 50% / 0.3) 0%, hsl(20 80% 30% / 0.4) 100%)",
  },
  {
    name: "Forklifts & Loaders",
    description: "Material handling equipment for warehouses, factories, and industrial applications.",
    icon: Forklift,
    vehicleCount: 200,
    href: "/browse?category=forklifts",
    gradient: "linear-gradient(135deg, hsl(180 60% 40% / 0.3) 0%, hsl(180 60% 25% / 0.4) 100%)",
  },
  {
    name: "Ambulance & Medical",
    description: "Emergency and non-emergency medical transport vehicles with trained staff.",
    icon: Ambulance,
    vehicleCount: 150,
    href: "/browse?category=ambulance",
    gradient: "linear-gradient(135deg, hsl(0 70% 50% / 0.3) 0%, hsl(0 70% 30% / 0.4) 100%)",
  },
];

const Categories = () => {
  return (
    <>
      <Helmet>
        <title>Vehicle Categories - RentWheels</title>
        <meta name="description" content="Browse all vehicle categories on RentWheels. Find taxis, luxury cars, trucks, construction equipment, bikes, buses, and more." />
      </Helmet>
      <div className="min-h-screen bg-background">
        <Navbar />
        
        <main className="pt-24 pb-16">
          <div className="container mx-auto px-4">
            {/* Header */}
            <div className="text-center max-w-2xl mx-auto mb-12">
              <h1 className="text-4xl md:text-5xl font-bold text-foreground mb-4">
                Vehicle <span className="text-gradient">Categories</span>
              </h1>
              <p className="text-lg text-muted-foreground">
                Choose from a wide range of vehicle categories to match your specific needs
              </p>
            </div>

            {/* Categories Grid */}
            <div className="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-3 xl:grid-cols-4 gap-6">
              {categories.map((category) => (
                <CategoryCard key={category.name} {...category} />
              ))}
            </div>
          </div>
        </main>

        <Footer />
      </div>
    </>
  );
};

export default Categories;
