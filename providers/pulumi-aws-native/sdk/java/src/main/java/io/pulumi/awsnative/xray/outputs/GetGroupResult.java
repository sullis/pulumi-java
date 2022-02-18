// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.xray.outputs;

import io.pulumi.awsnative.xray.outputs.GroupInsightsConfiguration;
import io.pulumi.awsnative.xray.outputs.TagsItemProperties;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetGroupResult {
    /**
     * The filter expression defining criteria by which to group traces.
     * 
     */
    private final @Nullable String filterExpression;
    /**
     * The ARN of the group that was generated on creation.
     * 
     */
    private final @Nullable String groupARN;
    /**
     * The case-sensitive name of the new group. Names must be unique.
     * 
     */
    private final @Nullable String groupName;
    private final @Nullable GroupInsightsConfiguration insightsConfiguration;
    private final @Nullable List<TagsItemProperties> tags;

    @OutputCustomType.Constructor({"filterExpression","groupARN","groupName","insightsConfiguration","tags"})
    private GetGroupResult(
        @Nullable String filterExpression,
        @Nullable String groupARN,
        @Nullable String groupName,
        @Nullable GroupInsightsConfiguration insightsConfiguration,
        @Nullable List<TagsItemProperties> tags) {
        this.filterExpression = filterExpression;
        this.groupARN = groupARN;
        this.groupName = groupName;
        this.insightsConfiguration = insightsConfiguration;
        this.tags = tags;
    }

    /**
     * The filter expression defining criteria by which to group traces.
     * 
     */
    public Optional<String> getFilterExpression() {
        return Optional.ofNullable(this.filterExpression);
    }
    /**
     * The ARN of the group that was generated on creation.
     * 
     */
    public Optional<String> getGroupARN() {
        return Optional.ofNullable(this.groupARN);
    }
    /**
     * The case-sensitive name of the new group. Names must be unique.
     * 
     */
    public Optional<String> getGroupName() {
        return Optional.ofNullable(this.groupName);
    }
    public Optional<GroupInsightsConfiguration> getInsightsConfiguration() {
        return Optional.ofNullable(this.insightsConfiguration);
    }
    public List<TagsItemProperties> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String filterExpression;
        private @Nullable String groupARN;
        private @Nullable String groupName;
        private @Nullable GroupInsightsConfiguration insightsConfiguration;
        private @Nullable List<TagsItemProperties> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterExpression = defaults.filterExpression;
    	      this.groupARN = defaults.groupARN;
    	      this.groupName = defaults.groupName;
    	      this.insightsConfiguration = defaults.insightsConfiguration;
    	      this.tags = defaults.tags;
        }

        public Builder setFilterExpression(@Nullable String filterExpression) {
            this.filterExpression = filterExpression;
            return this;
        }

        public Builder setGroupARN(@Nullable String groupARN) {
            this.groupARN = groupARN;
            return this;
        }

        public Builder setGroupName(@Nullable String groupName) {
            this.groupName = groupName;
            return this;
        }

        public Builder setInsightsConfiguration(@Nullable GroupInsightsConfiguration insightsConfiguration) {
            this.insightsConfiguration = insightsConfiguration;
            return this;
        }

        public Builder setTags(@Nullable List<TagsItemProperties> tags) {
            this.tags = tags;
            return this;
        }

        public GetGroupResult build() {
            return new GetGroupResult(filterExpression, groupARN, groupName, insightsConfiguration, tags);
        }
    }
}
