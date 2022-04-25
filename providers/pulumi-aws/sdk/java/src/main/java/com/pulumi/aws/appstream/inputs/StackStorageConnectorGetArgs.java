// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appstream.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StackStorageConnectorGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final StackStorageConnectorGetArgs Empty = new StackStorageConnectorGetArgs();

    /**
     * Type of storage connector. Valid values are: `HOMEFOLDERS`, `GOOGLE_DRIVE`, `ONE_DRIVE`.
     * 
     */
    @Import(name="connectorType", required=true)
    private Output<String> connectorType;

    /**
     * @return Type of storage connector. Valid values are: `HOMEFOLDERS`, `GOOGLE_DRIVE`, `ONE_DRIVE`.
     * 
     */
    public Output<String> connectorType() {
        return this.connectorType;
    }

    /**
     * Names of the domains for the account.
     * 
     */
    @Import(name="domains")
    private @Nullable Output<List<String>> domains;

    /**
     * @return Names of the domains for the account.
     * 
     */
    public Optional<Output<List<String>>> domains() {
        return Optional.ofNullable(this.domains);
    }

    /**
     * ARN of the storage connector.
     * 
     */
    @Import(name="resourceIdentifier")
    private @Nullable Output<String> resourceIdentifier;

    /**
     * @return ARN of the storage connector.
     * 
     */
    public Optional<Output<String>> resourceIdentifier() {
        return Optional.ofNullable(this.resourceIdentifier);
    }

    private StackStorageConnectorGetArgs() {}

    private StackStorageConnectorGetArgs(StackStorageConnectorGetArgs $) {
        this.connectorType = $.connectorType;
        this.domains = $.domains;
        this.resourceIdentifier = $.resourceIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StackStorageConnectorGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StackStorageConnectorGetArgs $;

        public Builder() {
            $ = new StackStorageConnectorGetArgs();
        }

        public Builder(StackStorageConnectorGetArgs defaults) {
            $ = new StackStorageConnectorGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectorType Type of storage connector. Valid values are: `HOMEFOLDERS`, `GOOGLE_DRIVE`, `ONE_DRIVE`.
         * 
         * @return builder
         * 
         */
        public Builder connectorType(Output<String> connectorType) {
            $.connectorType = connectorType;
            return this;
        }

        /**
         * @param connectorType Type of storage connector. Valid values are: `HOMEFOLDERS`, `GOOGLE_DRIVE`, `ONE_DRIVE`.
         * 
         * @return builder
         * 
         */
        public Builder connectorType(String connectorType) {
            return connectorType(Output.of(connectorType));
        }

        /**
         * @param domains Names of the domains for the account.
         * 
         * @return builder
         * 
         */
        public Builder domains(@Nullable Output<List<String>> domains) {
            $.domains = domains;
            return this;
        }

        /**
         * @param domains Names of the domains for the account.
         * 
         * @return builder
         * 
         */
        public Builder domains(List<String> domains) {
            return domains(Output.of(domains));
        }

        /**
         * @param domains Names of the domains for the account.
         * 
         * @return builder
         * 
         */
        public Builder domains(String... domains) {
            return domains(List.of(domains));
        }

        /**
         * @param resourceIdentifier ARN of the storage connector.
         * 
         * @return builder
         * 
         */
        public Builder resourceIdentifier(@Nullable Output<String> resourceIdentifier) {
            $.resourceIdentifier = resourceIdentifier;
            return this;
        }

        /**
         * @param resourceIdentifier ARN of the storage connector.
         * 
         * @return builder
         * 
         */
        public Builder resourceIdentifier(String resourceIdentifier) {
            return resourceIdentifier(Output.of(resourceIdentifier));
        }

        public StackStorageConnectorGetArgs build() {
            $.connectorType = Objects.requireNonNull($.connectorType, "expected parameter 'connectorType' to be non-null");
            return $;
        }
    }

}
