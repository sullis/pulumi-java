// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dax;

import com.pulumi.aws.dax.inputs.ParameterGroupParameterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ParameterGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ParameterGroupArgs Empty = new ParameterGroupArgs();

    /**
     * A description of the parameter group.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the parameter group.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the parameter group.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the parameter group.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The parameters of the parameter group.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<List<ParameterGroupParameterArgs>> parameters;

    /**
     * @return The parameters of the parameter group.
     * 
     */
    public Optional<Output<List<ParameterGroupParameterArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private ParameterGroupArgs() {}

    private ParameterGroupArgs(ParameterGroupArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ParameterGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ParameterGroupArgs $;

        public Builder() {
            $ = new ParameterGroupArgs();
        }

        public Builder(ParameterGroupArgs defaults) {
            $ = new ParameterGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A description of the parameter group.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the parameter group.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name of the parameter group.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the parameter group.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameters The parameters of the parameter group.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<List<ParameterGroupParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters The parameters of the parameter group.
         * 
         * @return builder
         * 
         */
        public Builder parameters(List<ParameterGroupParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param parameters The parameters of the parameter group.
         * 
         * @return builder
         * 
         */
        public Builder parameters(ParameterGroupParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }

        public ParameterGroupArgs build() {
            return $;
        }
    }

}
