// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53recoverycontrol;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RoutingControlArgs extends com.pulumi.resources.ResourceArgs {

    public static final RoutingControlArgs Empty = new RoutingControlArgs();

    /**
     * ARN of the cluster in which this routing control will reside.
     * 
     */
    @Import(name="clusterArn", required=true)
    private Output<String> clusterArn;

    /**
     * @return ARN of the cluster in which this routing control will reside.
     * 
     */
    public Output<String> clusterArn() {
        return this.clusterArn;
    }

    /**
     * ARN of the control panel in which this routing control will reside.
     * 
     */
    @Import(name="controlPanelArn")
    private @Nullable Output<String> controlPanelArn;

    /**
     * @return ARN of the control panel in which this routing control will reside.
     * 
     */
    public Optional<Output<String>> controlPanelArn() {
        return Optional.ofNullable(this.controlPanelArn);
    }

    /**
     * The name describing the routing control.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name describing the routing control.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private RoutingControlArgs() {}

    private RoutingControlArgs(RoutingControlArgs $) {
        this.clusterArn = $.clusterArn;
        this.controlPanelArn = $.controlPanelArn;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoutingControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoutingControlArgs $;

        public Builder() {
            $ = new RoutingControlArgs();
        }

        public Builder(RoutingControlArgs defaults) {
            $ = new RoutingControlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterArn ARN of the cluster in which this routing control will reside.
         * 
         * @return builder
         * 
         */
        public Builder clusterArn(Output<String> clusterArn) {
            $.clusterArn = clusterArn;
            return this;
        }

        /**
         * @param clusterArn ARN of the cluster in which this routing control will reside.
         * 
         * @return builder
         * 
         */
        public Builder clusterArn(String clusterArn) {
            return clusterArn(Output.of(clusterArn));
        }

        /**
         * @param controlPanelArn ARN of the control panel in which this routing control will reside.
         * 
         * @return builder
         * 
         */
        public Builder controlPanelArn(@Nullable Output<String> controlPanelArn) {
            $.controlPanelArn = controlPanelArn;
            return this;
        }

        /**
         * @param controlPanelArn ARN of the control panel in which this routing control will reside.
         * 
         * @return builder
         * 
         */
        public Builder controlPanelArn(String controlPanelArn) {
            return controlPanelArn(Output.of(controlPanelArn));
        }

        /**
         * @param name The name describing the routing control.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name describing the routing control.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public RoutingControlArgs build() {
            $.clusterArn = Objects.requireNonNull($.clusterArn, "expected parameter 'clusterArn' to be non-null");
            return $;
        }
    }

}
