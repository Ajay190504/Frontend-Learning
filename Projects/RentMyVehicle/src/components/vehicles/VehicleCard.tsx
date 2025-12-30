import { MapPin, Clock, Star, Heart, IndianRupee } from "lucide-react";
import { Button } from "@/components/ui/button";
import { Badge } from "@/components/ui/badge";
import { Link } from "react-router-dom";

interface VehicleCardProps {
  id: string;
  name: string;
  image?: string;
  images?: string[];
  category: string;
  location: string;
  hourlyRate: number;
  dailyRate: number;
  rating: number;
  reviews: number;
  ownerName: string;
  isAvailable?: boolean;
}

const VehicleCard = ({
  id,
  name,
  image,
  category,
  location,
  hourlyRate,
  dailyRate,
  rating,
  reviews,
  ownerName,
  isAvailable = true,
}: VehicleCardProps) => {
  return (
    <div className="glass-card glow-effect overflow-hidden group transition-all duration-300 hover:scale-[1.02]">
      {/* Image */}
      <div className="relative h-48 overflow-hidden">
        <img
          src={(images && images.length > 0) ? images[0] : image}
          alt={name}
          className="w-full h-full object-cover transition-transform duration-500 group-hover:scale-110"
        />
        <div className="absolute inset-0 bg-gradient-to-t from-background/80 to-transparent" />
        
        {/* Badges */}
        <div className="absolute top-3 left-3 flex gap-2">
          <Badge variant="secondary" className="bg-card/80 backdrop-blur-sm">
            {category}
          </Badge>
          {!isAvailable && (
            <Badge variant="destructive">Unavailable</Badge>
          )}
        </div>

        {/* Wishlist */}
        <button className="absolute top-3 right-3 w-8 h-8 rounded-full bg-card/80 backdrop-blur-sm flex items-center justify-center text-muted-foreground hover:text-destructive hover:bg-card transition-all">
          <Heart className="w-4 h-4" />
        </button>

        {/* Rating */}
        <div className="absolute bottom-3 left-3 flex items-center gap-1.5 bg-card/80 backdrop-blur-sm px-2 py-1 rounded-lg">
          <Star className="w-4 h-4 text-primary fill-primary" />
          <span className="text-sm font-medium text-foreground">{rating}</span>
          <span className="text-xs text-muted-foreground">({reviews})</span>
        </div>
      </div>

      {/* Content */}
      <div className="p-4 space-y-3">
        <div>
          <h3 className="font-semibold text-foreground text-lg truncate">{name}</h3>
          <p className="text-sm text-muted-foreground">by {ownerName}</p>
        </div>

        <div className="flex items-center gap-2 text-muted-foreground">
          <MapPin className="w-4 h-4 text-primary" />
          <span className="text-sm truncate">{location}</span>
        </div>

        {/* Pricing */}
        <div className="flex items-center justify-between pt-2 border-t border-border">
          <div className="space-y-0.5">
            <div className="flex items-center gap-1">
              <IndianRupee className="w-4 h-4 text-primary" />
              <span className="text-lg font-bold text-foreground">{hourlyRate}</span>
              <span className="text-sm text-muted-foreground">/hr</span>
            </div>
            <div className="flex items-center gap-1 text-muted-foreground">
              <Clock className="w-3 h-3" />
              <span className="text-xs">₹{dailyRate}/day</span>
            </div>
          </div>
          
          <Link to={`/vehicle/${id}`}>
            <Button size="sm" disabled={!isAvailable}>
              View Details
            </Button>
          </Link>
        </div>
      </div>
    </div>
  );
};

export default VehicleCard;
