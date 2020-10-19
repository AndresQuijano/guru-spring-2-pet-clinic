package guru.springframework.guruspring2petclinic.bootstrap;

import guru.springframework.guruspring2petclinic.model.Owner;
import guru.springframework.guruspring2petclinic.model.Pet;
import guru.springframework.guruspring2petclinic.model.PetType;
import guru.springframework.guruspring2petclinic.model.Vet;
import guru.springframework.guruspring2petclinic.services.OwnerService;
import guru.springframework.guruspring2petclinic.services.PetTypeService;
import guru.springframework.guruspring2petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType dog=new PetType();
        System.out.println(dog.toString());
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);
        System.out.println(savedDogPetType.toString());

        PetType cat=new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Micheal");
        owner1.setLastName("Weston");
        owner1.setAddress("Cll 53 c sur nro 40 160");
        owner1.setCity("Miami");
        owner1.setTelephone("3380029");

        Pet mikesPet=new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDay(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("Cra 29 b nro 40 fs 85");
        owner2.setCity("Miami");
        owner2.setTelephone("2706703");

        Pet fionasCat=new Pet();
        fionasCat.setName("Just cat");
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDay(LocalDate.now());
        fionasCat.setPetType(savedCatPetType);
        owner2.getPets().add(fionasCat);

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");






        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2); //John actually put vet1 here but I am sure that was a mistake he didnt catch

        System.out.println("Loaded Vets....");
    }
}
