// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDashboardArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDashboardArgs Empty = new GetDashboardArgs();

    @Import(name="awsAccountId", required=true)
      private final String awsAccountId;

    public String awsAccountId() {
        return this.awsAccountId;
    }

    @Import(name="dashboardId", required=true)
      private final String dashboardId;

    public String dashboardId() {
        return this.dashboardId;
    }

    public GetDashboardArgs(
        String awsAccountId,
        String dashboardId) {
        this.awsAccountId = Objects.requireNonNull(awsAccountId, "expected parameter 'awsAccountId' to be non-null");
        this.dashboardId = Objects.requireNonNull(dashboardId, "expected parameter 'dashboardId' to be non-null");
    }

    private GetDashboardArgs() {
        this.awsAccountId = null;
        this.dashboardId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDashboardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String awsAccountId;
        private String dashboardId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDashboardArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccountId = defaults.awsAccountId;
    	      this.dashboardId = defaults.dashboardId;
        }

        public Builder awsAccountId(String awsAccountId) {
            this.awsAccountId = Objects.requireNonNull(awsAccountId);
            return this;
        }
        public Builder dashboardId(String dashboardId) {
            this.dashboardId = Objects.requireNonNull(dashboardId);
            return this;
        }        public GetDashboardArgs build() {
            return new GetDashboardArgs(awsAccountId, dashboardId);
        }
    }
}
