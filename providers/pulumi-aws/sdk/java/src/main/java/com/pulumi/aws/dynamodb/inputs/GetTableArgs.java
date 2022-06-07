// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dynamodb.inputs;

import com.pulumi.aws.dynamodb.inputs.GetTableServerSideEncryptionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTableArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTableArgs Empty = new GetTableArgs();

    /**
     * The name of the DynamoDB table.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the DynamoDB table.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    @Import(name="serverSideEncryption")
    private @Nullable Output<GetTableServerSideEncryptionArgs> serverSideEncryption;

    public Optional<Output<GetTableServerSideEncryptionArgs>> serverSideEncryption() {
        return Optional.ofNullable(this.serverSideEncryption);
    }

    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetTableArgs() {}

    private GetTableArgs(GetTableArgs $) {
        this.name = $.name;
        this.serverSideEncryption = $.serverSideEncryption;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTableArgs $;

        public Builder() {
            $ = new GetTableArgs();
        }

        public Builder(GetTableArgs defaults) {
            $ = new GetTableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the DynamoDB table.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the DynamoDB table.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder serverSideEncryption(@Nullable Output<GetTableServerSideEncryptionArgs> serverSideEncryption) {
            $.serverSideEncryption = serverSideEncryption;
            return this;
        }

        public Builder serverSideEncryption(GetTableServerSideEncryptionArgs serverSideEncryption) {
            return serverSideEncryption(Output.of(serverSideEncryption));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GetTableArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
