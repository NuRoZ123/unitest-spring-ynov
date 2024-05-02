package fr.nuroz.ams_ynov;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
public class TestFirstController {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void Test_info() throws Exception {
        this.mockMvc.perform(get("/info")).andExpect(status().isOk())
        .andExpect(content().string(containsString("Ynov")));
    }

    @Test
    public void Test_details() throws Exception {
        this.mockMvc.perform(get("/details")).andExpect(status().isOk())
                .andExpect(content().string(containsString("data")));
    }
}
