import Navbar from "@/components/layout/Navbar";
import Footer from "@/components/layout/Footer";
import HeroSection from "@/components/home/HeroSection";
import CategoriesSection from "@/components/home/CategoriesSection";
import FeaturedVehicles from "@/components/home/FeaturedVehicles";
import HowItWorks from "@/components/home/HowItWorks";
import OwnerCTA from "@/components/home/OwnerCTA";
import { Helmet } from "react-helmet-async";

const Index = () => {
  return (
    <>
      <Helmet>
        <title>RentWheels - India's #1 Vehicle Rental Platform</title>
        <meta name="description" content="Rent any vehicle anytime, anywhere. From taxis to luxury cars, transport trucks to infrastructure equipment. Connect with verified owners for the best deals." />
      </Helmet>
      <div className="min-h-screen bg-background">
        <Navbar />
        <main>
          <HeroSection />
          <CategoriesSection />
          <FeaturedVehicles />
          <HowItWorks />
          <OwnerCTA />
        </main>
        <Footer />
      </div>
    </>
  );
};

export default Index;
