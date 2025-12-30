import { Link } from "react-router-dom";
import Navbar from "@/components/layout/Navbar";
import Footer from "@/components/layout/Footer";
import { Button } from "@/components/ui/button";
import { Badge } from "@/components/ui/badge";
import { Check, IndianRupee, Zap, Shield, Headphones, TrendingUp } from "lucide-react";
import { Helmet } from "react-helmet-async";

const features = [
  "Unlimited vehicle listings",
  "Booking management dashboard",
  "Customer contact information",
  "Analytics & insights",
  "Priority customer support",
  "Featured listings (2/month)",
  "No commission on bookings",
  "Direct payment from renters",
];

const benefits = [
  { icon: Zap, title: "Instant Visibility", description: "Your vehicles appear in search results immediately" },
  { icon: Shield, title: "Verified Badge", description: "Build trust with the verified owner badge" },
  { icon: Headphones, title: "Priority Support", description: "Get help faster with dedicated support" },
  { icon: TrendingUp, title: "Analytics", description: "Track views, inquiries, and bookings" },
];

const Pricing = () => {
  return (
    <>
      <Helmet>
        <title>Pricing - RentWheels</title>
        <meta name="description" content="Simple subscription pricing for vehicle owners. List unlimited vehicles for just ₹500/month with no booking commissions." />
      </Helmet>
      <div className="min-h-screen bg-background">
        <Navbar />
        
        <main className="pt-24 pb-16">
          <div className="container mx-auto px-4">
            {/* Header */}
            <div className="text-center max-w-2xl mx-auto mb-16">
              <Badge className="mb-4">For Vehicle Owners</Badge>
              <h1 className="text-4xl md:text-5xl font-bold text-foreground mb-4">
                Simple, <span className="text-gradient">Transparent</span> Pricing
              </h1>
              <p className="text-lg text-muted-foreground">
                One plan, everything included. No hidden fees, no commissions.
              </p>
            </div>

            {/* Pricing Card */}
            <div className="max-w-lg mx-auto mb-20">
              <div className="glass-card p-8 md:p-10 relative overflow-hidden">
                {/* Glow effect */}
                <div className="absolute -top-20 -right-20 w-40 h-40 bg-primary/30 rounded-full blur-3xl" />
                
                <div className="relative">
                  {/* Price */}
                  <div className="text-center mb-8">
                    <div className="flex items-center justify-center gap-1 mb-2">
                      <IndianRupee className="w-10 h-10 text-primary" />
                      <span className="text-6xl md:text-7xl font-bold text-foreground">500</span>
                    </div>
                    <p className="text-xl text-muted-foreground">per month</p>
                  </div>

                  {/* Features */}
                  <ul className="space-y-4 mb-8">
                    {features.map((feature) => (
                      <li key={feature} className="flex items-center gap-3">
                        <div className="w-5 h-5 rounded-full bg-primary/20 flex items-center justify-center">
                          <Check className="w-3 h-3 text-primary" />
                        </div>
                        <span className="text-foreground">{feature}</span>
                      </li>
                    ))}
                  </ul>

                  {/* CTA */}
                  <Link to="/register?role=owner">
                    <Button size="xl" className="w-full">
                      Get Started Today
                    </Button>
                  </Link>
                  
                  <p className="text-center text-sm text-muted-foreground mt-4">
                    Cancel anytime. No long-term contracts.
                  </p>
                </div>
              </div>
            </div>

            {/* Benefits */}
            <div className="max-w-4xl mx-auto">
              <h2 className="text-2xl md:text-3xl font-bold text-foreground text-center mb-10">
                What You Get
              </h2>
              <div className="grid grid-cols-1 sm:grid-cols-2 gap-6">
                {benefits.map((benefit) => (
                  <div key={benefit.title} className="glass-card p-6 flex items-start gap-4">
                    <div className="w-12 h-12 rounded-xl bg-primary/10 flex items-center justify-center shrink-0">
                      <benefit.icon className="w-6 h-6 text-primary" />
                    </div>
                    <div>
                      <h3 className="font-semibold text-foreground mb-1">{benefit.title}</h3>
                      <p className="text-sm text-muted-foreground">{benefit.description}</p>
                    </div>
                  </div>
                ))}
              </div>
            </div>

            {/* FAQ */}
            <div className="max-w-2xl mx-auto mt-20">
              <h2 className="text-2xl md:text-3xl font-bold text-foreground text-center mb-10">
                Frequently Asked Questions
              </h2>
              <div className="space-y-4">
                {[
                  { q: "How do I pay the subscription?", a: "You can pay via UPI, credit/debit card, or net banking. Payment gateway integration coming soon!" },
                  { q: "Can I cancel my subscription?", a: "Yes, you can cancel anytime. Your listings will remain active until the end of your billing period." },
                  { q: "Do you take commission on bookings?", a: "No! We never take any commission. All payments go directly from renters to you." },
                  { q: "How do customers pay me?", a: "Customers contact you directly. You negotiate the price and receive payment directly from them." },
                ].map((faq) => (
                  <div key={faq.q} className="glass-card p-6">
                    <h3 className="font-semibold text-foreground mb-2">{faq.q}</h3>
                    <p className="text-sm text-muted-foreground">{faq.a}</p>
                  </div>
                ))}
              </div>
            </div>
          </div>
        </main>

        <Footer />
      </div>
    </>
  );
};

export default Pricing;
