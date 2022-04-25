// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TaskDefinitionPlacementConstraint {
    /**
     * @return Cluster Query Language expression to apply to the constraint. For more information, see [Cluster Query Language in the Amazon EC2 Container Service Developer Guide](http://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html).
     * 
     */
    private final @Nullable String expression;
    /**
     * @return Proxy type. The default value is `APPMESH`. The only supported value is `APPMESH`.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private TaskDefinitionPlacementConstraint(
        @CustomType.Parameter("expression") @Nullable String expression,
        @CustomType.Parameter("type") String type) {
        this.expression = expression;
        this.type = type;
    }

    /**
     * @return Cluster Query Language expression to apply to the constraint. For more information, see [Cluster Query Language in the Amazon EC2 Container Service Developer Guide](http://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html).
     * 
     */
    public Optional<String> expression() {
        return Optional.ofNullable(this.expression);
    }
    /**
     * @return Proxy type. The default value is `APPMESH`. The only supported value is `APPMESH`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionPlacementConstraint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expression;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionPlacementConstraint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
    	      this.type = defaults.type;
        }

        public Builder expression(@Nullable String expression) {
            this.expression = expression;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public TaskDefinitionPlacementConstraint build() {
            return new TaskDefinitionPlacementConstraint(expression, type);
        }
    }
}
