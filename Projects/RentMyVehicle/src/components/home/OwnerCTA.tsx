import { ArrowRight, Check } from "lucide-react";
import { Button } from "@/components/ui/button";
import { Link } from "react-router-dom";

const benefits = [
  "Reach thousands of potential renters",
  "Set your own prices and availability",
  "Secure and verified bookings",
  "Easy vehicle management dashboard",
  "Low subscription cost - just ₹500/month",
];

const OwnerCTA = () => {
  return (
    <section className="py-20">
      <div className="container mx-auto px-4">
        <div className="glass-card overflow-hidden">
          <div className="grid lg:grid-cols-2 gap-0">
            {/* Content */}
            <div className="p-8 md:p-12 lg:p-16 space-y-8">
              <div>
                <span className="inline-block px-3 py-1 rounded-full bg-primary/10 text-primary text-sm font-medium mb-4">
                  For Vehicle Owners
                </span>
                <h2 className="text-3xl md:text-4xl font-bold text-foreground mb-4">
                  Start Earning from Your <span className="text-gradient">Vehicles</span>
                </h2>
                <p className="text-muted-foreground text-lg">
                  Join thousands of vehicle owners who are maximizing their earnings by listing on RentWheels.
                </p>
              </div>

              <ul className="space-y-4">
                {benefits.map((benefit) => (
                  <li key={benefit} className="flex items-center gap-3">
                    <div className="w-6 h-6 rounded-full bg-primary/20 flex items-center justify-center">
                      <Check className="w-4 h-4 text-primary" />
                    </div>
                    <span className="text-foreground">{benefit}</span>
                  </li>
                ))}
              </ul>

              <div className="flex flex-col sm:flex-row gap-4">
                <Link to="/register?role=owner">
                  <Button size="lg" className="gap-2 w-full sm:w-auto">
                    Register as Owner
                    <ArrowRight className="w-4 h-4" />
                  </Button>
                </Link>
                <Link to="/pricing">
                  <Button variant="outline" size="lg" className="w-full sm:w-auto">
                    View Pricing
                  </Button>
                </Link>
              </div>
            </div>

            {/* Image/Visual */}
            <div className="relative bg-gradient-to-br from-primary/20 to-primary/5 min-h-[300px] lg:min-h-full flex items-center justify-center p-8">
              <div className="absolute inset-0 bg-[url('https://images.unsplash.com/photo-1449965408869-eaa3f722e40d?w=800')] bg-cover bg-center opacity-20" />
              <div className="relative z-10 text-center space-y-6">
                <div className="text-6xl md:text-8xl font-bold text-primary">₹500</div>
                <div className="text-xl text-foreground font-medium">per month</div>
                <p className="text-muted-foreground max-w-xs mx-auto">
                  Unlimited vehicle listings, booking management, and customer insights
                </p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
  );
};

export default OwnerCTA;
