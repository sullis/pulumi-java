// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.azurenative.dataprotection.inputs.RetentionTagArgs;
import io.pulumi.azurenative.dataprotection.inputs.ScheduleBasedBackupCriteriaArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Tagging criteria
 * 
 */
public final class TaggingCriteriaArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaggingCriteriaArgs Empty = new TaggingCriteriaArgs();

    /**
     * Criteria which decides whether the tag can be applied to a triggered backup.
     * 
     */
    @InputImport(name="criteria")
    private final @Nullable Input<List<ScheduleBasedBackupCriteriaArgs>> criteria;

    public Input<List<ScheduleBasedBackupCriteriaArgs>> getCriteria() {
        return this.criteria == null ? Input.empty() : this.criteria;
    }

    /**
     * Specifies if tag is default.
     * 
     */
    @InputImport(name="isDefault", required=true)
    private final Input<Boolean> isDefault;

    public Input<Boolean> getIsDefault() {
        return this.isDefault;
    }

    /**
     * Retention tag information
     * 
     */
    @InputImport(name="tagInfo", required=true)
    private final Input<RetentionTagArgs> tagInfo;

    public Input<RetentionTagArgs> getTagInfo() {
        return this.tagInfo;
    }

    /**
     * Retention Tag priority.
     * 
     */
    @InputImport(name="taggingPriority", required=true)
    private final Input<Double> taggingPriority;

    public Input<Double> getTaggingPriority() {
        return this.taggingPriority;
    }

    public TaggingCriteriaArgs(
        @Nullable Input<List<ScheduleBasedBackupCriteriaArgs>> criteria,
        Input<Boolean> isDefault,
        Input<RetentionTagArgs> tagInfo,
        Input<Double> taggingPriority) {
        this.criteria = criteria;
        this.isDefault = Objects.requireNonNull(isDefault, "expected parameter 'isDefault' to be non-null");
        this.tagInfo = Objects.requireNonNull(tagInfo, "expected parameter 'tagInfo' to be non-null");
        this.taggingPriority = Objects.requireNonNull(taggingPriority, "expected parameter 'taggingPriority' to be non-null");
    }

    private TaggingCriteriaArgs() {
        this.criteria = Input.empty();
        this.isDefault = Input.empty();
        this.tagInfo = Input.empty();
        this.taggingPriority = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaggingCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ScheduleBasedBackupCriteriaArgs>> criteria;
        private Input<Boolean> isDefault;
        private Input<RetentionTagArgs> tagInfo;
        private Input<Double> taggingPriority;

        public Builder() {
    	      // Empty
        }

        public Builder(TaggingCriteriaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.criteria = defaults.criteria;
    	      this.isDefault = defaults.isDefault;
    	      this.tagInfo = defaults.tagInfo;
    	      this.taggingPriority = defaults.taggingPriority;
        }

        public Builder setCriteria(@Nullable Input<List<ScheduleBasedBackupCriteriaArgs>> criteria) {
            this.criteria = criteria;
            return this;
        }

        public Builder setCriteria(@Nullable List<ScheduleBasedBackupCriteriaArgs> criteria) {
            this.criteria = Input.ofNullable(criteria);
            return this;
        }

        public Builder setIsDefault(Input<Boolean> isDefault) {
            this.isDefault = Objects.requireNonNull(isDefault);
            return this;
        }

        public Builder setIsDefault(Boolean isDefault) {
            this.isDefault = Input.of(Objects.requireNonNull(isDefault));
            return this;
        }

        public Builder setTagInfo(Input<RetentionTagArgs> tagInfo) {
            this.tagInfo = Objects.requireNonNull(tagInfo);
            return this;
        }

        public Builder setTagInfo(RetentionTagArgs tagInfo) {
            this.tagInfo = Input.of(Objects.requireNonNull(tagInfo));
            return this;
        }

        public Builder setTaggingPriority(Input<Double> taggingPriority) {
            this.taggingPriority = Objects.requireNonNull(taggingPriority);
            return this;
        }

        public Builder setTaggingPriority(Double taggingPriority) {
            this.taggingPriority = Input.of(Objects.requireNonNull(taggingPriority));
            return this;
        }

        public TaggingCriteriaArgs build() {
            return new TaggingCriteriaArgs(criteria, isDefault, tagInfo, taggingPriority);
        }
    }
}
