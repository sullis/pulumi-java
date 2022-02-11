// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.outputs;

import io.pulumi.awsnative.backup.outputs.FrameworkTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class FrameworkControlControlScopeProperties {
    private final @Nullable List<String> complianceResourceIds;
    private final @Nullable List<String> complianceResourceTypes;
    private final @Nullable List<FrameworkTag> tags;

    @OutputCustomType.Constructor({"complianceResourceIds","complianceResourceTypes","tags"})
    private FrameworkControlControlScopeProperties(
        @Nullable List<String> complianceResourceIds,
        @Nullable List<String> complianceResourceTypes,
        @Nullable List<FrameworkTag> tags) {
        this.complianceResourceIds = complianceResourceIds;
        this.complianceResourceTypes = complianceResourceTypes;
        this.tags = tags;
    }

    public List<String> getComplianceResourceIds() {
        return this.complianceResourceIds == null ? List.of() : this.complianceResourceIds;
    }
    public List<String> getComplianceResourceTypes() {
        return this.complianceResourceTypes == null ? List.of() : this.complianceResourceTypes;
    }
    public List<FrameworkTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrameworkControlControlScopeProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> complianceResourceIds;
        private @Nullable List<String> complianceResourceTypes;
        private @Nullable List<FrameworkTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(FrameworkControlControlScopeProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.complianceResourceIds = defaults.complianceResourceIds;
    	      this.complianceResourceTypes = defaults.complianceResourceTypes;
    	      this.tags = defaults.tags;
        }

        public Builder setComplianceResourceIds(@Nullable List<String> complianceResourceIds) {
            this.complianceResourceIds = complianceResourceIds;
            return this;
        }

        public Builder setComplianceResourceTypes(@Nullable List<String> complianceResourceTypes) {
            this.complianceResourceTypes = complianceResourceTypes;
            return this;
        }

        public Builder setTags(@Nullable List<FrameworkTag> tags) {
            this.tags = tags;
            return this;
        }

        public FrameworkControlControlScopeProperties build() {
            return new FrameworkControlControlScopeProperties(complianceResourceIds, complianceResourceTypes, tags);
        }
    }
}
