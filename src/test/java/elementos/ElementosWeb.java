package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {
	
	private By automobile = By.id("nav_automobile");
	private By make = By.name("Make");
	private By makeOption = By.cssSelector("#make > option:nth-child(3)");
	private By enginePerformance = By.id("engineperformance");
	private By dateManufacture = By.id("dateofmanufacture");
	private By numberSeats = By.name("Number of Seats");
	private By numberSeatsOption = By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[4]/select/option[6]");
	private By fuelType = By.name("Fuel Type");
	private By fuelTypeOption = By.xpath("//*[@id=\"fuel\"]/option[2]");
	private By listPrice = By.id("listprice");
	private By licensePlateNumber = By.id("licenseplatenumber");
	private By annualMileage = By.name("Annual Mileage");
	private By next1 = By.id("nextenterinsurantdata");
	private By firstName = By.id("firstname");
	private By lastName = By.id("lastname");
	private By dateOfBirth = By.id("birthdate");
	private By gender = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span");
	private By streetAddress = By.id("streetaddress");
	private By country = By.id("country");
	private By countryOption = By.xpath("//*[@id=\"country\"]/option[32]");
	private By zipCode = By.id("zipcode");
	private By city = By.id("city");
	private By occupation = By.id("occupation");
	private By occupationOption = By.xpath("//*[@id=\"occupation\"]/option[2]");
	private By hobbies = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[4]/span");
	private By next2 = By.id("nextenterproductdata");
	private By startDate = By.id("startdate");
	private By insuranceSum = By.id("insurancesum");
	private By insuranceSumOption = By.xpath("//*[@id=\"insurancesum\"]/option[3]");
	private By meritRating = By.id("meritrating");
	private By meritRatingOption = By.xpath("//*[@id=\"meritrating\"]/option[2]");
	private By damageInsurance = By.id("damageinsurance");
	private By damageInsuranceOption = By.xpath("//*[@id=\"damageinsurance\"]/option[2]");
	private By optionalProducts = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span");
	private By courtesyCar = By.id("courtesycar");
	private By courtesyCarOption = By.xpath("//*[@id=\"courtesycar\"]/option[2]");
	private By next3 = By.id("nextselectpriceoption");
	private By ultimateOption = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span");
	private By next4 = By.id("nextsendquote");
	private By email = By.id("email");
	private By phone = By.id("phone");
	private By username = By.id("username");
	private By password = By.id("password");
	private By confirmPassword = By.id("confirmpassword");
	private By send = By.id("sendemail");
	private By mensagem = By.xpath("/html/body/div[4]/h2");
	
	public By getMensagem() {
		return mensagem;
	}
	public By getEmail() {
		return email;
	}
	public By getPhone() {
		return phone;
	}
	public By getUsername() {
		return username;
	}
	public By getPassword() {
		return password;
	}
	public By getConfirmPassword() {
		return confirmPassword;
	}
	public By getSend() {
		return send;
	}
	public By getUltimateOption() {
		return ultimateOption;
	}
	public By getNext4() {
		return next4;
	}
	public By getStartDate() {
		return startDate;
	}
	public By getInsuranceSum() {
		return insuranceSum;
	}
	public By getInsuranceSumOption() {
		return insuranceSumOption;
	}
	public By getMeritRating() {
		return meritRating;
	}
	public By getMeritRatingOption() {
		return meritRatingOption;
	}
	public By getDamageInsurance() {
		return damageInsurance;
	}
	public By getDamageInsuranceOption() {
		return damageInsuranceOption;
	}
	public By getOptionalProducts() {
		return optionalProducts;
	}
	public By getCourtesyCar() {
		return courtesyCar;
	}
	public By getCourtesyCarOption() {
		return courtesyCarOption;
	}
	public By getNext3() {
		return next3;
	}
	public By getNext2() {
		return next2;
	}
	public By getFirstName() {
		return firstName;
	}
	public By getLastName() {
		return lastName;
	}
	public By getDateOfBirth() {
		return dateOfBirth;
	}
	public By getGender() {
		return gender;
	}
	public By getStreetAddress() {
		return streetAddress;
	}
	public By getCountry() {
		return country;
	}
	public By getCountryOption() {
		return countryOption;
	}
	public By getZipCode() {
		return zipCode;
	}
	public By getCity() {
		return city;
	}
	public By getOccupation() {
		return occupation;
	}
	public By getOccupationOption() {
		return occupationOption;
	}
	public By getHobbies() {
		return hobbies;
	}
	public By getAutomobile() {
		return automobile;
	}
	public By getFuelTypeOption() {
		return fuelTypeOption;
	}

	public By getNext1() {
		return next1;
	}

	public By getListPrice() {
		return listPrice;
	}

	public By getLicensePlateNumber() {
		return licensePlateNumber;
	}

	public By getAnnualMileage() {
		return annualMileage;
	}

	public By getDateManufacture() {
		return dateManufacture;
	}

	public By getFuelType() {
		return fuelType;
	}

	public By getNumberSeats() {
		return numberSeats;
	}

	public By getNumberSeatsOption() {
		return numberSeatsOption;
	}

	public By getMakeOption() {
		return makeOption;
	}

	public By getEnginePerformance() {
		return enginePerformance;
	}

	public By getMake() {
		return make;
	}

}
