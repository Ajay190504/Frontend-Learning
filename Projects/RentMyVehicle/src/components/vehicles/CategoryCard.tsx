import { Link } from "react-router-dom";
import { LucideIcon } from "lucide-react";

interface CategoryCardProps {
  name: string;
  description: string;
  icon: LucideIcon;
  vehicleCount: number;
  href: string;
  gradient: string;
}

const CategoryCard = ({
  name,
  description,
  icon: Icon,
  vehicleCount,
  href,
  gradient,
}: CategoryCardProps) => {
  return (
    <Link
      to={href}
      className="group relative overflow-hidden rounded-2xl p-6 transition-all duration-300 hover:scale-[1.02] hover:shadow-xl"
      style={{ background: gradient }}
    >
      <div className="absolute inset-0 bg-gradient-to-br from-transparent to-background/20" />
      
      <div className="relative z-10 space-y-4">
        <div className="w-14 h-14 rounded-xl bg-background/20 backdrop-blur-sm flex items-center justify-center transition-transform group-hover:scale-110">
          <Icon className="w-7 h-7 text-foreground" />
        </div>

        <div>
          <h3 className="font-bold text-foreground text-xl mb-1">{name}</h3>
          <p className="text-foreground/70 text-sm">{description}</p>
        </div>

        <div className="flex items-center justify-between pt-2">
          <span className="text-sm font-medium text-foreground/80">
            {vehicleCount}+ vehicles
          </span>
          <span className="text-sm font-semibold text-foreground group-hover:translate-x-1 transition-transform">
            Explore →
          </span>
        </div>
      </div>

      {/* Decorative circles */}
      <div className="absolute -right-6 -bottom-6 w-32 h-32 rounded-full bg-background/10 blur-xl" />
      <div className="absolute -right-2 -top-10 w-20 h-20 rounded-full bg-background/10 blur-lg" />
    </Link>
  );
};

export default CategoryCard;
