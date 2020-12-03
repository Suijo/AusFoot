import footDao.entity.match_stats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    JdbcTemplate jdbcTemplate;


    @GetMapping(path = "/match_stats")
    public ResponseEntity<List<match_stats>> getAllUsers(){
        List<match_stats> users = jdbcTemplate.query("SELECT * FROM USER",new BeanPropertyRowMapper(match_stats.class));
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

}
