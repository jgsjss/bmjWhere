package com.example.bmjwhere.service;

import com.example.bmjwhere.dto.ClubMemberDTO;
import com.example.bmjwhere.entity.ClubMember;
import com.example.bmjwhere.entity.ClubMemberRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.HashMap;
import java.util.Map;

public interface ClubMemberService  {


    String register2(ClubMemberDTO clubMemberDTO); // 영화 등록
    // Map<>: Movie 객체와 MovieImage 객체 2개의 객체를 Object 타입으로 Map 컬렉션에 담아서 반환
    default Map<String, Object> dtoToEntity(ClubMemberDTO clubMemberDTO) { // map 컬렉션 타입으로 반환
        Map<String, Object> entityMap = new HashMap<>();

        // MovieDTO 객체를 Movie Entity 타입으로 변환
        ClubMember clubMember = ClubMember.builder()
                .email(clubMemberDTO.getEmail())
                .name(clubMemberDTO.getName())
                .fromSocial(false)
                .password(clubMemberDTO.getPassword())
                .build();


        clubMember.addMemberRole(ClubMemberRole.USER);

        entityMap.put("clubMember", clubMember); // Map 컬렉션에 추가
        return entityMap;
    }

    default ClubMemberDTO entitiesToDTO(ClubMember clubMember) {
        // Movie Entity -> MovieDTO, 영화 객체
        ClubMemberDTO clubMemberDTO = ClubMemberDTO.builder()
                .email(clubMember.getEmail())
                .name(clubMember.getName())
                .password(clubMember.getPassword())
                .build();


        return clubMemberDTO;
    }
    }
