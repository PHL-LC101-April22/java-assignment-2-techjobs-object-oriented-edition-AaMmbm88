package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */

@RunWith(JUnit4.class)

public class JobTest {

    Job job_1;

    @Before
    public void createJob1(){ job_1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));}
    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1, job2);
    }

    @Test
    public void testJobConstructorSetsAllFields(){

        assertTrue(job_1.getName() instanceof String);
        assertEquals(job_1.getName(), "Product tester");
        assertTrue(job_1.getEmployer() instanceof Employer);
        assertEquals(job_1.getEmployer().getValue(), "ACME");
        assertTrue(job_1.getLocation() instanceof Location);
        assertEquals(job_1.getLocation().getValue(), "Desert");
        assertTrue(job_1.getPositionType() instanceof PositionType);
        assertEquals(job_1.getPositionType().getValue(), "Quality control");
        assertTrue(job_1.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(job_1.getCoreCompetency().getValue(), "Persistence");

    }
    @Test
    public void testJobsForEquality(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertFalse(job1.equals(job2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
//        String job1String = job_1.toString();
        char char0 = job_1.toString().charAt(0);
        char charLast = job_1.toString().charAt(job_1.toString().length()-1);
        assertEquals(char0, '\n');
        assertEquals(charLast, '\n');
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        assertTrue(job_1.toString().contains("ID: "));
        assertTrue(job_1.toString().contains(String.valueOf(job_1.getId())));
        assertTrue(job_1.toString().contains("Name: "));
        assertTrue(job_1.toString().contains(job_1.getName()));
        assertTrue(job_1.toString().contains("Employer: "));
        assertTrue(job_1.toString().contains(job_1.getEmployer().getValue()));
        assertTrue(job_1.toString().contains("Location: "));
        assertTrue(job_1.toString().contains(job_1.getLocation().getValue()));
        assertTrue(job_1.toString().contains("Position Type: "));
        assertTrue(job_1.toString().contains(job_1.getPositionType().getValue()));
        assertTrue(job_1.toString().contains("Core Competency: "));
        assertTrue(job_1.toString().contains(job_1.getCoreCompetency().getValue()));
    }

    @Test
    public void testToStringTHandlesEmptyFields(){
         job_1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency());
         assertEquals("OOPS! This job does not seem to exist.", job_1.getCoreCompetency().getValue());

    }

}

