package org.launchcode.techjobs.oo.test;

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
    @Test
    public void testSettingJobId(){
        Job job_1 = new Job();
        Job job_2 = new Job();
        assertNotEquals(job_1, job_2);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job job_1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
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

}

