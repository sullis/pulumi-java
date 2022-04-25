// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A (sub) field of a type.
 * 
 */
public final class FieldArgs extends com.pulumi.resources.ResourceArgs {

    public static final FieldArgs Empty = new FieldArgs();

    /**
     * The maximum number of times this field can be repeated. 0 or -1 means unbounded.
     * 
     */
    @Import(name="maxOccurs")
    private @Nullable Output<Integer> maxOccurs;

    /**
     * @return The maximum number of times this field can be repeated. 0 or -1 means unbounded.
     * 
     */
    public Optional<Output<Integer>> maxOccurs() {
        return Optional.ofNullable(this.maxOccurs);
    }

    /**
     * The minimum number of times this field must be present/repeated.
     * 
     */
    @Import(name="minOccurs")
    private @Nullable Output<Integer> minOccurs;

    /**
     * @return The minimum number of times this field must be present/repeated.
     * 
     */
    public Optional<Output<Integer>> minOccurs() {
        return Optional.ofNullable(this.minOccurs);
    }

    /**
     * The name of the field. For example, &#34;PID-1&#34; or just &#34;1&#34;.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the field. For example, &#34;PID-1&#34; or just &#34;1&#34;.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The HL7v2 table this field refers to. For example, PID-15 (Patient&#39;s Primary Language) usually refers to table &#34;0296&#34;.
     * 
     */
    @Import(name="table")
    private @Nullable Output<String> table;

    /**
     * @return The HL7v2 table this field refers to. For example, PID-15 (Patient&#39;s Primary Language) usually refers to table &#34;0296&#34;.
     * 
     */
    public Optional<Output<String>> table() {
        return Optional.ofNullable(this.table);
    }

    /**
     * The type of this field. A Type with this name must be defined in an Hl7TypesConfig.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of this field. A Type with this name must be defined in an Hl7TypesConfig.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private FieldArgs() {}

    private FieldArgs(FieldArgs $) {
        this.maxOccurs = $.maxOccurs;
        this.minOccurs = $.minOccurs;
        this.name = $.name;
        this.table = $.table;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FieldArgs $;

        public Builder() {
            $ = new FieldArgs();
        }

        public Builder(FieldArgs defaults) {
            $ = new FieldArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxOccurs The maximum number of times this field can be repeated. 0 or -1 means unbounded.
         * 
         * @return builder
         * 
         */
        public Builder maxOccurs(@Nullable Output<Integer> maxOccurs) {
            $.maxOccurs = maxOccurs;
            return this;
        }

        /**
         * @param maxOccurs The maximum number of times this field can be repeated. 0 or -1 means unbounded.
         * 
         * @return builder
         * 
         */
        public Builder maxOccurs(Integer maxOccurs) {
            return maxOccurs(Output.of(maxOccurs));
        }

        /**
         * @param minOccurs The minimum number of times this field must be present/repeated.
         * 
         * @return builder
         * 
         */
        public Builder minOccurs(@Nullable Output<Integer> minOccurs) {
            $.minOccurs = minOccurs;
            return this;
        }

        /**
         * @param minOccurs The minimum number of times this field must be present/repeated.
         * 
         * @return builder
         * 
         */
        public Builder minOccurs(Integer minOccurs) {
            return minOccurs(Output.of(minOccurs));
        }

        /**
         * @param name The name of the field. For example, &#34;PID-1&#34; or just &#34;1&#34;.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the field. For example, &#34;PID-1&#34; or just &#34;1&#34;.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param table The HL7v2 table this field refers to. For example, PID-15 (Patient&#39;s Primary Language) usually refers to table &#34;0296&#34;.
         * 
         * @return builder
         * 
         */
        public Builder table(@Nullable Output<String> table) {
            $.table = table;
            return this;
        }

        /**
         * @param table The HL7v2 table this field refers to. For example, PID-15 (Patient&#39;s Primary Language) usually refers to table &#34;0296&#34;.
         * 
         * @return builder
         * 
         */
        public Builder table(String table) {
            return table(Output.of(table));
        }

        /**
         * @param type The type of this field. A Type with this name must be defined in an Hl7TypesConfig.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of this field. A Type with this name must be defined in an Hl7TypesConfig.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public FieldArgs build() {
            return $;
        }
    }

}
