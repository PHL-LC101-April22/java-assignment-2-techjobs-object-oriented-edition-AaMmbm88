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
        assertEquals("Product tester", job_1.getName());
        assertTrue(job_1.getEmployer() instanceof Employer);
        assertEquals("ACME", job_1.getEmployer().getValue());
        assertTrue(job_1.getLocation() instanceof Location);
        assertEquals("Desert", job_1.getLocation().getValue());
        assertTrue(job_1.getPositionType() instanceof PositionType);
        assertEquals("Quality control", job_1.getPositionType().getValue());
        assertTrue(job_1.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", job_1.getCoreCompetency().getValue());

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
        assertEquals('\n', char0);
        assertEquals('\n', charLast);
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){

//        assertEquals("\nID: 1" +
//                "\nName: Product tester" +
//                "\nEmployer: ACME" +
//                "\nLocation: Desert" +
//                "\nPosition Type: Quality control" +
//                "\nCore Competency: Persistence\n",job_1.toString());


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
    public void testToStringHandlesEmptyField(){
         job_1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency(""));
         assertTrue(job_1.toString().contains("Core Competency: Data not available"));

    }

}

