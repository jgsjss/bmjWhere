package com.example.bmjwhere.service;

import com.example.bmjwhere.dto.ClubMemberDTO;
import com.example.bmjwhere.entity.ClubMember;
import com.example.bmjwhere.entity.ClubMemberRole;
import com.example.bmjwhere.repository.ClubMemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@Service // 해당 클래스를 루트 컨테이너에 빈(Bean) 객체로 생성
@Log4j2
@RequiredArgsConstructor
public class ClubMemberServiceImpl implements ClubMemberService{

    private final ClubMemberRepository clubMemberRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;


    @Transactional
    @Override
    public String register2(ClubMemberDTO clubMemberDTO) {

        Map<String, Object> entityMap = dtoToEntity(clubMemberDTO); // Entity 타입으로 변환 된 영화 객체와 영화 리스트 객체를 가져옴
        ClubMember clubMember = (ClubMember) entityMap.get("clubMember"); // 영화 객체를 가져옴
      //  List<MovieImage> movieImageList = (List<MovieImage>) entityMap.get("imgList"); // List<>에 담겨있는 영화 이미지 객체를 가져옴
        String encodedPassword = passwordEncoder.encode(clubMember.getPassword());
        clubMember.setPassword(encodedPassword);
        clubMember.addMemberRole(ClubMemberRole.USER);

        clubMemberRepository.save(clubMember);
        // List<>에 담겨 있는 영화 이미지들의 객체를 DB에 저장
        //movieImageList.forEach(movieImage -> {
        //    imageRepository.save(movieImage);
        //}
        //);

        // 영화 객체 안에 있는 영화 번호를 반환
     return clubMember.getEmail();
    }}