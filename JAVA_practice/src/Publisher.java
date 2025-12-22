import java.util.Objects;

@Entity
class Publisher{
	
	private String name;
	private String address;
	
	public Publisher() {
		
	}
	public Publisher(String name, String address) {
		this.name=name;
		this.address=address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(address, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publisher other = (Publisher) obj;
		return Objects.equals(address, other.address) && Objects.equals(name, other.name);
	}
	
	@Override
	public String toString() {
		return "Publisher [name=" + name + ", address=" + address + "]";
	}
	
	
	
	
}