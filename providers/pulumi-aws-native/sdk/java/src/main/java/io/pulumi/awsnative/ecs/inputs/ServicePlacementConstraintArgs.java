// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.awsnative.ecs.enums.ServicePlacementConstraintType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePlacementConstraintArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePlacementConstraintArgs Empty = new ServicePlacementConstraintArgs();

    @Import(name="expression")
      private final @Nullable Output<String> expression;

    public Output<String> expression() {
        return this.expression == null ? Codegen.empty() : this.expression;
    }

    @Import(name="type", required=true)
      private final Output<ServicePlacementConstraintType> type;

    public Output<ServicePlacementConstraintType> type() {
        return this.type;
    }

    public ServicePlacementConstraintArgs(
        @Nullable Output<String> expression,
        Output<ServicePlacementConstraintType> type) {
        this.expression = expression;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ServicePlacementConstraintArgs() {
        this.expression = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePlacementConstraintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> expression;
        private Output<ServicePlacementConstraintType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePlacementConstraintArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
    	      this.type = defaults.type;
        }

        public Builder expression(@Nullable Output<String> expression) {
            this.expression = expression;
            return this;
        }
        public Builder expression(@Nullable String expression) {
            this.expression = Codegen.ofNullable(expression);
            return this;
        }
        public Builder type(Output<ServicePlacementConstraintType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(ServicePlacementConstraintType type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public ServicePlacementConstraintArgs build() {
            return new ServicePlacementConstraintArgs(expression, type);
        }
    }
}
