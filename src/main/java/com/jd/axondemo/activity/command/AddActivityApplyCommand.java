package com.jd.axondemo.activity.command;

import com.jd.axondemo.activity.dto.ActivityApplyDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.axonframework.commandhandling.TargetAggregateIdentifier;

import java.util.Collection;

@AllArgsConstructor
public class AddActivityApplyCommand {

    @TargetAggregateIdentifier
    @Getter
    private Long id;

    @Getter
    private Collection<ActivityApplyDTO> activityApplyDTOS;

}
