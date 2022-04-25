// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DashboardArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardArgs Empty = new DashboardArgs();

    /**
     * The detailed information about the dashboard, including what widgets are included and their location on the dashboard. You can read more about the body structure in the [documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/CloudWatch-Dashboard-Body-Structure.html).
     * 
     */
    @Import(name="dashboardBody", required=true)
    private Output<String> dashboardBody;

    /**
     * @return The detailed information about the dashboard, including what widgets are included and their location on the dashboard. You can read more about the body structure in the [documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/CloudWatch-Dashboard-Body-Structure.html).
     * 
     */
    public Output<String> dashboardBody() {
        return this.dashboardBody;
    }

    /**
     * The name of the dashboard.
     * 
     */
    @Import(name="dashboardName", required=true)
    private Output<String> dashboardName;

    /**
     * @return The name of the dashboard.
     * 
     */
    public Output<String> dashboardName() {
        return this.dashboardName;
    }

    private DashboardArgs() {}

    private DashboardArgs(DashboardArgs $) {
        this.dashboardBody = $.dashboardBody;
        this.dashboardName = $.dashboardName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardArgs $;

        public Builder() {
            $ = new DashboardArgs();
        }

        public Builder(DashboardArgs defaults) {
            $ = new DashboardArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dashboardBody The detailed information about the dashboard, including what widgets are included and their location on the dashboard. You can read more about the body structure in the [documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/CloudWatch-Dashboard-Body-Structure.html).
         * 
         * @return builder
         * 
         */
        public Builder dashboardBody(Output<String> dashboardBody) {
            $.dashboardBody = dashboardBody;
            return this;
        }

        /**
         * @param dashboardBody The detailed information about the dashboard, including what widgets are included and their location on the dashboard. You can read more about the body structure in the [documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/CloudWatch-Dashboard-Body-Structure.html).
         * 
         * @return builder
         * 
         */
        public Builder dashboardBody(String dashboardBody) {
            return dashboardBody(Output.of(dashboardBody));
        }

        /**
         * @param dashboardName The name of the dashboard.
         * 
         * @return builder
         * 
         */
        public Builder dashboardName(Output<String> dashboardName) {
            $.dashboardName = dashboardName;
            return this;
        }

        /**
         * @param dashboardName The name of the dashboard.
         * 
         * @return builder
         * 
         */
        public Builder dashboardName(String dashboardName) {
            return dashboardName(Output.of(dashboardName));
        }

        public DashboardArgs build() {
            $.dashboardBody = Objects.requireNonNull($.dashboardBody, "expected parameter 'dashboardBody' to be non-null");
            $.dashboardName = Objects.requireNonNull($.dashboardName, "expected parameter 'dashboardName' to be non-null");
            return $;
        }
    }

}
