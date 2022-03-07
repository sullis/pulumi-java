// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoverycontrol.outputs;

import io.pulumi.awsnative.route53recoverycontrol.enums.RoutingControlStatus;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRoutingControlResult {
    /**
     * The name of the routing control. You can use any non-white space character in the name.
     * 
     */
    private final @Nullable String name;
    /**
     * The Amazon Resource Name (ARN) of the routing control.
     * 
     */
    private final @Nullable String routingControlArn;
    /**
     * The deployment status of the routing control. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
     * 
     */
    private final @Nullable RoutingControlStatus status;

    @OutputCustomType.Constructor({"name","routingControlArn","status"})
    private GetRoutingControlResult(
        @Nullable String name,
        @Nullable String routingControlArn,
        @Nullable RoutingControlStatus status) {
        this.name = name;
        this.routingControlArn = routingControlArn;
        this.status = status;
    }

    /**
     * The name of the routing control. You can use any non-white space character in the name.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The Amazon Resource Name (ARN) of the routing control.
     * 
    */
    public Optional<String> getRoutingControlArn() {
        return Optional.ofNullable(this.routingControlArn);
    }
    /**
     * The deployment status of the routing control. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
     * 
    */
    public Optional<RoutingControlStatus> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoutingControlResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String routingControlArn;
        private @Nullable RoutingControlStatus status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRoutingControlResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.routingControlArn = defaults.routingControlArn;
    	      this.status = defaults.status;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setRoutingControlArn(@Nullable String routingControlArn) {
            this.routingControlArn = routingControlArn;
            return this;
        }

        public Builder setStatus(@Nullable RoutingControlStatus status) {
            this.status = status;
            return this;
        }
        public GetRoutingControlResult build() {
            return new GetRoutingControlResult(name, routingControlArn, status);
        }
    }
}