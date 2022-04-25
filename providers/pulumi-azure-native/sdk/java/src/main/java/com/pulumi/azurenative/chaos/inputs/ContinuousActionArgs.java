// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.chaos.inputs;

import com.pulumi.azurenative.chaos.inputs.KeyValuePairArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Model that represents a continuous action.
 * 
 */
public final class ContinuousActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContinuousActionArgs Empty = new ContinuousActionArgs();

    /**
     * ISO8601 formatted string that represents a duration.
     * 
     */
    @Import(name="duration", required=true)
    private Output<String> duration;

    /**
     * @return ISO8601 formatted string that represents a duration.
     * 
     */
    public Output<String> duration() {
        return this.duration;
    }

    /**
     * String that represents a Capability URN.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return String that represents a Capability URN.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * List of key value pairs.
     * 
     */
    @Import(name="parameters", required=true)
    private Output<List<KeyValuePairArgs>> parameters;

    /**
     * @return List of key value pairs.
     * 
     */
    public Output<List<KeyValuePairArgs>> parameters() {
        return this.parameters;
    }

    /**
     * String that represents a selector.
     * 
     */
    @Import(name="selectorId", required=true)
    private Output<String> selectorId;

    /**
     * @return String that represents a selector.
     * 
     */
    public Output<String> selectorId() {
        return this.selectorId;
    }

    /**
     * Enum that discriminates between action models.
     * Expected value is &#39;continuous&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Enum that discriminates between action models.
     * Expected value is &#39;continuous&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private ContinuousActionArgs() {}

    private ContinuousActionArgs(ContinuousActionArgs $) {
        this.duration = $.duration;
        this.name = $.name;
        this.parameters = $.parameters;
        this.selectorId = $.selectorId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContinuousActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContinuousActionArgs $;

        public Builder() {
            $ = new ContinuousActionArgs();
        }

        public Builder(ContinuousActionArgs defaults) {
            $ = new ContinuousActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param duration ISO8601 formatted string that represents a duration.
         * 
         * @return builder
         * 
         */
        public Builder duration(Output<String> duration) {
            $.duration = duration;
            return this;
        }

        /**
         * @param duration ISO8601 formatted string that represents a duration.
         * 
         * @return builder
         * 
         */
        public Builder duration(String duration) {
            return duration(Output.of(duration));
        }

        /**
         * @param name String that represents a Capability URN.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name String that represents a Capability URN.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameters List of key value pairs.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Output<List<KeyValuePairArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters List of key value pairs.
         * 
         * @return builder
         * 
         */
        public Builder parameters(List<KeyValuePairArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param parameters List of key value pairs.
         * 
         * @return builder
         * 
         */
        public Builder parameters(KeyValuePairArgs... parameters) {
            return parameters(List.of(parameters));
        }

        /**
         * @param selectorId String that represents a selector.
         * 
         * @return builder
         * 
         */
        public Builder selectorId(Output<String> selectorId) {
            $.selectorId = selectorId;
            return this;
        }

        /**
         * @param selectorId String that represents a selector.
         * 
         * @return builder
         * 
         */
        public Builder selectorId(String selectorId) {
            return selectorId(Output.of(selectorId));
        }

        /**
         * @param type Enum that discriminates between action models.
         * Expected value is &#39;continuous&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Enum that discriminates between action models.
         * Expected value is &#39;continuous&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ContinuousActionArgs build() {
            $.duration = Objects.requireNonNull($.duration, "expected parameter 'duration' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.parameters = Objects.requireNonNull($.parameters, "expected parameter 'parameters' to be non-null");
            $.selectorId = Objects.requireNonNull($.selectorId, "expected parameter 'selectorId' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
