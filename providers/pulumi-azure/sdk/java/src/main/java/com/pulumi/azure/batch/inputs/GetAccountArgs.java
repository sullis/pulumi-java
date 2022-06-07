// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch.inputs;

import com.pulumi.azure.batch.inputs.GetAccountEncryptionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccountArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccountArgs Empty = new GetAccountArgs();

    @Import(name="encryption")
    private @Nullable Output<GetAccountEncryptionArgs> encryption;

    public Optional<Output<GetAccountEncryptionArgs>> encryption() {
        return Optional.ofNullable(this.encryption);
    }

    /**
     * The name of the Batch account.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Batch account.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The Name of the Resource Group where this Batch account exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The Name of the Resource Group where this Batch account exists.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetAccountArgs() {}

    private GetAccountArgs(GetAccountArgs $) {
        this.encryption = $.encryption;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountArgs $;

        public Builder() {
            $ = new GetAccountArgs();
        }

        public Builder(GetAccountArgs defaults) {
            $ = new GetAccountArgs(Objects.requireNonNull(defaults));
        }

        public Builder encryption(@Nullable Output<GetAccountEncryptionArgs> encryption) {
            $.encryption = encryption;
            return this;
        }

        public Builder encryption(GetAccountEncryptionArgs encryption) {
            return encryption(Output.of(encryption));
        }

        /**
         * @param name The name of the Batch account.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Batch account.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The Name of the Resource Group where this Batch account exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The Name of the Resource Group where this Batch account exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetAccountArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
