package com.nice.eem.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nice.eem.entity.WorkflexConcentricProgramData;

@Repository
public interface WorkflesxConcentricProgramService extends JpaRepository<WorkflexConcentricProgramData, Long> {

	@Query("SELECT  r.programname, r.ctzdatetime, r.ssactiveagents, r.totalagent, r.totalagentparticipating, r.extrahrreqapproved, r.extrahrreqdeclined, r.extrahrreqautoapproved,   r.extrahrhoursapproved,  r.extrahrhoursdeclined,  r.extrahrhourautoapproved,  r.extrahrrulercmdagent,  r.extrahrrtcapproved,   r.extrahragtaccepted, r.extrahragtdecliend,  r.extrahragtnores,  r.vtoreqapproved,  r.vtoreqdeclined,  r.vtoreqautoapproved,  r.vtohoursapproved,   r.vtohoursdeclined,  r.vtohourautoapproved,  r.vtohourrulercmdagent,  r.vtohourrtcapproved, r.vtohouragtaccepted,  r.vtohouragtdecliend,  r.vtohouragtnores, "
			+ "  r.ttlswap,  r.ttlswaphr,  r.tradereq,  r.ttltrade_accepted,  r.ttltradehr, r.schedulehr,  r.currentdayactivegent, r.extrahrreqrtcwaiting, "
			+ "  r.extrahrhoursrtcwaiting,  r.vtoreqrtcwaiting, r.vtohoursrtcwaiting FROM WorkflexConcentricProgramData r  ORDER BY r.ctzdatetime DESC")
	public List<WorkflexConcentricProgramData> findProgramWiseData();
	
	/*
	 * @Query("SELECT u FROM User u WHERE LOWER(u.id) = LOWER(:id)") public
	 * List<User> find(@Param("id") String id);
	 */
	
	/*String query = em.createQuery(query.toString("select code from "+ entityName).getSingleResult();*/
	
}

