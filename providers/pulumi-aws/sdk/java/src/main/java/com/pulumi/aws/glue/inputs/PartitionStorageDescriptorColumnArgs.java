// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PartitionStorageDescriptorColumnArgs extends com.pulumi.resources.ResourceArgs {

    public static final PartitionStorageDescriptorColumnArgs Empty = new PartitionStorageDescriptorColumnArgs();

    /**
     * Free-form text comment.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Free-form text comment.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Name of the SerDe.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the SerDe.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The datatype of data in the Column.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The datatype of data in the Column.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private PartitionStorageDescriptorColumnArgs() {}

    private PartitionStorageDescriptorColumnArgs(PartitionStorageDescriptorColumnArgs $) {
        this.comment = $.comment;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PartitionStorageDescriptorColumnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PartitionStorageDescriptorColumnArgs $;

        public Builder() {
            $ = new PartitionStorageDescriptorColumnArgs();
        }

        public Builder(PartitionStorageDescriptorColumnArgs defaults) {
            $ = new PartitionStorageDescriptorColumnArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param comment Free-form text comment.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Free-form text comment.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param name Name of the SerDe.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the SerDe.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type The datatype of data in the Column.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The datatype of data in the Column.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public PartitionStorageDescriptorColumnArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
