// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.outputs;

import io.pulumi.awsnative.iotsitewise.outputs.DashboardTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDashboardResult {
    /**
     * The ARN of the dashboard.
     * 
     */
    private final @Nullable String dashboardArn;
    /**
     * The dashboard definition specified in a JSON literal.
     * 
     */
    private final @Nullable String dashboardDefinition;
    /**
     * A description for the dashboard.
     * 
     */
    private final @Nullable String dashboardDescription;
    /**
     * The ID of the dashboard.
     * 
     */
    private final @Nullable String dashboardId;
    /**
     * A friendly name for the dashboard.
     * 
     */
    private final @Nullable String dashboardName;
    /**
     * A list of key-value pairs that contain metadata for the dashboard.
     * 
     */
    private final @Nullable List<DashboardTag> tags;

    @CustomType.Constructor
    private GetDashboardResult(
        @CustomType.Parameter("dashboardArn") @Nullable String dashboardArn,
        @CustomType.Parameter("dashboardDefinition") @Nullable String dashboardDefinition,
        @CustomType.Parameter("dashboardDescription") @Nullable String dashboardDescription,
        @CustomType.Parameter("dashboardId") @Nullable String dashboardId,
        @CustomType.Parameter("dashboardName") @Nullable String dashboardName,
        @CustomType.Parameter("tags") @Nullable List<DashboardTag> tags) {
        this.dashboardArn = dashboardArn;
        this.dashboardDefinition = dashboardDefinition;
        this.dashboardDescription = dashboardDescription;
        this.dashboardId = dashboardId;
        this.dashboardName = dashboardName;
        this.tags = tags;
    }

    /**
     * The ARN of the dashboard.
     * 
    */
    public Optional<String> dashboardArn() {
        return Optional.ofNullable(this.dashboardArn);
    }
    /**
     * The dashboard definition specified in a JSON literal.
     * 
    */
    public Optional<String> dashboardDefinition() {
        return Optional.ofNullable(this.dashboardDefinition);
    }
    /**
     * A description for the dashboard.
     * 
    */
    public Optional<String> dashboardDescription() {
        return Optional.ofNullable(this.dashboardDescription);
    }
    /**
     * The ID of the dashboard.
     * 
    */
    public Optional<String> dashboardId() {
        return Optional.ofNullable(this.dashboardId);
    }
    /**
     * A friendly name for the dashboard.
     * 
    */
    public Optional<String> dashboardName() {
        return Optional.ofNullable(this.dashboardName);
    }
    /**
     * A list of key-value pairs that contain metadata for the dashboard.
     * 
    */
    public List<DashboardTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDashboardResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dashboardArn;
        private @Nullable String dashboardDefinition;
        private @Nullable String dashboardDescription;
        private @Nullable String dashboardId;
        private @Nullable String dashboardName;
        private @Nullable List<DashboardTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDashboardResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dashboardArn = defaults.dashboardArn;
    	      this.dashboardDefinition = defaults.dashboardDefinition;
    	      this.dashboardDescription = defaults.dashboardDescription;
    	      this.dashboardId = defaults.dashboardId;
    	      this.dashboardName = defaults.dashboardName;
    	      this.tags = defaults.tags;
        }

        public Builder dashboardArn(@Nullable String dashboardArn) {
            this.dashboardArn = dashboardArn;
            return this;
        }
        public Builder dashboardDefinition(@Nullable String dashboardDefinition) {
            this.dashboardDefinition = dashboardDefinition;
            return this;
        }
        public Builder dashboardDescription(@Nullable String dashboardDescription) {
            this.dashboardDescription = dashboardDescription;
            return this;
        }
        public Builder dashboardId(@Nullable String dashboardId) {
            this.dashboardId = dashboardId;
            return this;
        }
        public Builder dashboardName(@Nullable String dashboardName) {
            this.dashboardName = dashboardName;
            return this;
        }
        public Builder tags(@Nullable List<DashboardTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(DashboardTag... tags) {
            return tags(List.of(tags));
        }        public GetDashboardResult build() {
            return new GetDashboardResult(dashboardArn, dashboardDefinition, dashboardDescription, dashboardId, dashboardName, tags);
        }
    }
}
