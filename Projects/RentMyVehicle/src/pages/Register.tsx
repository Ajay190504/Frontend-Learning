import { useState } from "react";
import { Link, useNavigate, useSearchParams } from "react-router-dom";
import Navbar from "@/components/layout/Navbar";
import { Button } from "@/components/ui/button";
import { Input } from "@/components/ui/input";
import { Tabs, TabsContent, TabsList, TabsTrigger } from "@/components/ui/tabs";
import { useToast } from "@/hooks/use-toast";
import { Car, Mail, Lock, Eye, EyeOff, User, Phone, Building } from "lucide-react";
import { Helmet } from "react-helmet-async";

const Register = () => {
  const navigate = useNavigate();
  const { toast } = useToast();
  const [searchParams] = useSearchParams();
  const defaultTab = searchParams.get("role") === "owner" ? "owner" : "user";
  
  const [showPassword, setShowPassword] = useState(false);
  const [userForm, setUserForm] = useState({
    name: "",
    email: "",
    phone: "",
    password: "",
  });
  const [ownerForm, setOwnerForm] = useState({
    businessName: "",
    email: "",
    phone: "",
    password: "",
  });

  const handleUserRegister = async (e: React.FormEvent) => {
    e.preventDefault();
    try {
      const payload = { name: userForm.name, email: userForm.email, password: userForm.password, role: 'renter' };
      const res = await fetch('/api/auth/register', { method: 'POST', headers: { 'Content-Type': 'application/json' }, body: JSON.stringify(payload), credentials: 'include' });
      if (!res.ok) throw new Error('Register failed');
      toast({ title: 'Registration Successful!', description: 'Welcome to RentWheels.' });
      navigate('/browse');
    } catch (err) {
      console.error(err);
      toast({ title: 'Error', description: 'Could not register', variant: 'destructive' });
    }
  };

  const handleOwnerRegister = async (e: React.FormEvent) => {
    e.preventDefault();
    try {
      const payload = { name: ownerForm.businessName, email: ownerForm.email, password: ownerForm.password, role: 'owner' };
      const res = await fetch('/api/auth/register', { method: 'POST', headers: { 'Content-Type': 'application/json' }, body: JSON.stringify(payload), credentials: 'include' });
      if (!res.ok) throw new Error('Register failed');
      toast({ title: 'Owner Registration Successful!', description: 'Welcome to RentWheels.' });
      navigate('/owner');
    } catch (err) {
      console.error(err);
      toast({ title: 'Error', description: 'Could not register owner', variant: 'destructive' });
    }
  };

  return (
    <>
      <Helmet>
        <title>Register - RentWheels</title>
        <meta name="description" content="Create a RentWheels account to rent vehicles or list your own vehicles for rent." />
      </Helmet>
      <div className="min-h-screen bg-background">
        <Navbar />
        
        <main className="pt-24 pb-16 flex items-center justify-center min-h-screen">
          <div className="container mx-auto px-4">
            <div className="max-w-md mx-auto">
              {/* Logo */}
              <div className="text-center mb-8">
                <Link to="/" className="inline-flex items-center gap-2 mb-4">
                  <div className="w-12 h-12 rounded-xl bg-primary flex items-center justify-center">
                    <Car className="w-6 h-6 text-primary-foreground" />
                  </div>
                </Link>
                <h1 className="text-2xl font-bold text-foreground">Create Account</h1>
                <p className="text-muted-foreground">Join RentWheels today</p>
              </div>

              {/* Register Card */}
              <div className="glass-card p-8">
                <Tabs defaultValue={defaultTab} className="w-full">
                  <TabsList className="grid w-full grid-cols-2 mb-6">
                    <TabsTrigger value="user">Rent Vehicles</TabsTrigger>
                    <TabsTrigger value="owner">List Vehicles</TabsTrigger>
                  </TabsList>
                  
                  <TabsContent value="user">
                    <form onSubmit={handleUserRegister} className="space-y-4">
                      <div className="space-y-2">
                        <label className="text-sm font-medium text-foreground">Full Name</label>
                        <div className="relative">
                          <User className="absolute left-3 top-1/2 -translate-y-1/2 w-4 h-4 text-muted-foreground" />
                          <Input
                            type="text"
                            placeholder="John Doe"
                            className="pl-10"
                            value={userForm.name}
                            onChange={(e) => setUserForm({ ...userForm, name: e.target.value })}
                          />
                        </div>
                      </div>
                      <div className="space-y-2">
                        <label className="text-sm font-medium text-foreground">Email</label>
                        <div className="relative">
                          <Mail className="absolute left-3 top-1/2 -translate-y-1/2 w-4 h-4 text-muted-foreground" />
                          <Input
                            type="email"
                            placeholder="you@example.com"
                            className="pl-10"
                            value={userForm.email}
                            onChange={(e) => setUserForm({ ...userForm, email: e.target.value })}
                          />
                        </div>
                      </div>
                      <div className="space-y-2">
                        <label className="text-sm font-medium text-foreground">Phone Number</label>
                        <div className="relative">
                          <Phone className="absolute left-3 top-1/2 -translate-y-1/2 w-4 h-4 text-muted-foreground" />
                          <Input
                            type="tel"
                            placeholder="+91 98765 43210"
                            className="pl-10"
                            value={userForm.phone}
                            onChange={(e) => setUserForm({ ...userForm, phone: e.target.value })}
                          />
                        </div>
                      </div>
                      <div className="space-y-2">
                        <label className="text-sm font-medium text-foreground">Password</label>
                        <div className="relative">
                          <Lock className="absolute left-3 top-1/2 -translate-y-1/2 w-4 h-4 text-muted-foreground" />
                          <Input
                            type={showPassword ? "text" : "password"}
                            placeholder="••••••••"
                            className="pl-10 pr-10"
                            value={userForm.password}
                            onChange={(e) => setUserForm({ ...userForm, password: e.target.value })}
                          />
                          <button
                            type="button"
                            onClick={() => setShowPassword(!showPassword)}
                            className="absolute right-3 top-1/2 -translate-y-1/2 text-muted-foreground hover:text-foreground"
                          >
                            {showPassword ? <EyeOff className="w-4 h-4" /> : <Eye className="w-4 h-4" />}
                          </button>
                        </div>
                      </div>
                      <Button type="submit" className="w-full">Create Account</Button>
                    </form>
                  </TabsContent>
                  
                  <TabsContent value="owner">
                    <form onSubmit={handleOwnerRegister} className="space-y-4">
                      <div className="space-y-2">
                        <label className="text-sm font-medium text-foreground">Business Name</label>
                        <div className="relative">
                          <Building className="absolute left-3 top-1/2 -translate-y-1/2 w-4 h-4 text-muted-foreground" />
                          <Input
                            type="text"
                            placeholder="Your Business Name"
                            className="pl-10"
                            value={ownerForm.businessName}
                            onChange={(e) => setOwnerForm({ ...ownerForm, businessName: e.target.value })}
                          />
                        </div>
                      </div>
                      <div className="space-y-2">
                        <label className="text-sm font-medium text-foreground">Business Email</label>
                        <div className="relative">
                          <Mail className="absolute left-3 top-1/2 -translate-y-1/2 w-4 h-4 text-muted-foreground" />
                          <Input
                            type="email"
                            placeholder="business@example.com"
                            className="pl-10"
                            value={ownerForm.email}
                            onChange={(e) => setOwnerForm({ ...ownerForm, email: e.target.value })}
                          />
                        </div>
                      </div>
                      <div className="space-y-2">
                        <label className="text-sm font-medium text-foreground">Phone Number</label>
                        <div className="relative">
                          <Phone className="absolute left-3 top-1/2 -translate-y-1/2 w-4 h-4 text-muted-foreground" />
                          <Input
                            type="tel"
                            placeholder="+91 98765 43210"
                            className="pl-10"
                            value={ownerForm.phone}
                            onChange={(e) => setOwnerForm({ ...ownerForm, phone: e.target.value })}
                          />
                        </div>
                      </div>
                      <div className="space-y-2">
                        <label className="text-sm font-medium text-foreground">Password</label>
                        <div className="relative">
                          <Lock className="absolute left-3 top-1/2 -translate-y-1/2 w-4 h-4 text-muted-foreground" />
                          <Input
                            type={showPassword ? "text" : "password"}
                            placeholder="••••••••"
                            className="pl-10 pr-10"
                            value={ownerForm.password}
                            onChange={(e) => setOwnerForm({ ...ownerForm, password: e.target.value })}
                          />
                          <button
                            type="button"
                            onClick={() => setShowPassword(!showPassword)}
                            className="absolute right-3 top-1/2 -translate-y-1/2 text-muted-foreground hover:text-foreground"
                          >
                            {showPassword ? <EyeOff className="w-4 h-4" /> : <Eye className="w-4 h-4" />}
                          </button>
                        </div>
                      </div>
                      <Button type="submit" className="w-full">Create Owner Account</Button>
                    </form>
                  </TabsContent>
                </Tabs>

                <div className="mt-6 text-center text-sm text-muted-foreground">
                  Already have an account?{" "}
                  <Link to="/login" className="text-primary hover:underline font-medium">
                    Sign in
                  </Link>
                </div>
              </div>
            </div>
          </div>
        </main>
      </div>
    </>
  );
};

export default Register;
