// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dlm.outputs;

import io.pulumi.aws.dlm.outputs.LifecyclePolicyPolicyDetailsScheduleCreateRule;
import io.pulumi.aws.dlm.outputs.LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRule;
import io.pulumi.aws.dlm.outputs.LifecyclePolicyPolicyDetailsScheduleRetainRule;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LifecyclePolicyPolicyDetailsSchedule {
    /**
     * Whether to copy all user-defined tags from the source snapshot to the cross-region snapshot copy.
     * 
     */
    private final @Nullable Boolean copyTags;
    /**
     * See the `create_rule` block. Max of 1 per schedule.
     * 
     */
    private final LifecyclePolicyPolicyDetailsScheduleCreateRule createRule;
    /**
     * See the `cross_region_copy_rule` block. Max of 3 per schedule.
     * 
     */
    private final @Nullable List<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRule> crossRegionCopyRules;
    /**
     * A name for the schedule.
     * 
     */
    private final String name;
    /**
     * The retention rule that indicates how long snapshot copies are to be retained in the destination Region. See the `retain_rule` block. Max of 1 per schedule.
     * 
     */
    private final LifecyclePolicyPolicyDetailsScheduleRetainRule retainRule;
    /**
     * A map of tag keys and their values. DLM lifecycle policies will already tag the snapshot with the tags on the volume. This configuration adds extra tags on top of these.
     * 
     */
    private final @Nullable Map<String,String> tagsToAdd;

    @OutputCustomType.Constructor({"copyTags","createRule","crossRegionCopyRules","name","retainRule","tagsToAdd"})
    private LifecyclePolicyPolicyDetailsSchedule(
        @Nullable Boolean copyTags,
        LifecyclePolicyPolicyDetailsScheduleCreateRule createRule,
        @Nullable List<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRule> crossRegionCopyRules,
        String name,
        LifecyclePolicyPolicyDetailsScheduleRetainRule retainRule,
        @Nullable Map<String,String> tagsToAdd) {
        this.copyTags = copyTags;
        this.createRule = Objects.requireNonNull(createRule);
        this.crossRegionCopyRules = crossRegionCopyRules;
        this.name = Objects.requireNonNull(name);
        this.retainRule = Objects.requireNonNull(retainRule);
        this.tagsToAdd = tagsToAdd;
    }

    /**
     * Whether to copy all user-defined tags from the source snapshot to the cross-region snapshot copy.
     * 
    */
    public Optional<Boolean> getCopyTags() {
        return Optional.ofNullable(this.copyTags);
    }
    /**
     * See the `create_rule` block. Max of 1 per schedule.
     * 
    */
    public LifecyclePolicyPolicyDetailsScheduleCreateRule getCreateRule() {
        return this.createRule;
    }
    /**
     * See the `cross_region_copy_rule` block. Max of 3 per schedule.
     * 
    */
    public List<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRule> getCrossRegionCopyRules() {
        return this.crossRegionCopyRules == null ? List.of() : this.crossRegionCopyRules;
    }
    /**
     * A name for the schedule.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The retention rule that indicates how long snapshot copies are to be retained in the destination Region. See the `retain_rule` block. Max of 1 per schedule.
     * 
    */
    public LifecyclePolicyPolicyDetailsScheduleRetainRule getRetainRule() {
        return this.retainRule;
    }
    /**
     * A map of tag keys and their values. DLM lifecycle policies will already tag the snapshot with the tags on the volume. This configuration adds extra tags on top of these.
     * 
    */
    public Map<String,String> getTagsToAdd() {
        return this.tagsToAdd == null ? Map.of() : this.tagsToAdd;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LifecyclePolicyPolicyDetailsSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean copyTags;
        private LifecyclePolicyPolicyDetailsScheduleCreateRule createRule;
        private @Nullable List<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRule> crossRegionCopyRules;
        private String name;
        private LifecyclePolicyPolicyDetailsScheduleRetainRule retainRule;
        private @Nullable Map<String,String> tagsToAdd;

        public Builder() {
    	      // Empty
        }

        public Builder(LifecyclePolicyPolicyDetailsSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copyTags = defaults.copyTags;
    	      this.createRule = defaults.createRule;
    	      this.crossRegionCopyRules = defaults.crossRegionCopyRules;
    	      this.name = defaults.name;
    	      this.retainRule = defaults.retainRule;
    	      this.tagsToAdd = defaults.tagsToAdd;
        }

        public Builder setCopyTags(@Nullable Boolean copyTags) {
            this.copyTags = copyTags;
            return this;
        }

        public Builder setCreateRule(LifecyclePolicyPolicyDetailsScheduleCreateRule createRule) {
            this.createRule = Objects.requireNonNull(createRule);
            return this;
        }

        public Builder setCrossRegionCopyRules(@Nullable List<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRule> crossRegionCopyRules) {
            this.crossRegionCopyRules = crossRegionCopyRules;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRetainRule(LifecyclePolicyPolicyDetailsScheduleRetainRule retainRule) {
            this.retainRule = Objects.requireNonNull(retainRule);
            return this;
        }

        public Builder setTagsToAdd(@Nullable Map<String,String> tagsToAdd) {
            this.tagsToAdd = tagsToAdd;
            return this;
        }
        public LifecyclePolicyPolicyDetailsSchedule build() {
            return new LifecyclePolicyPolicyDetailsSchedule(copyTags, createRule, crossRegionCopyRules, name, retainRule, tagsToAdd);
        }
    }
}