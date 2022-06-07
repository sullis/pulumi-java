// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCloudConnectorPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudConnectorPlainArgs Empty = new GetCloudConnectorPlainArgs();

    /**
     * Connector Name.
     * 
     */
    @Import(name="connectorName", required=true)
    private String connectorName;

    /**
     * @return Connector Name.
     * 
     */
    public String connectorName() {
        return this.connectorName;
    }

    /**
     * May be used to expand the collectionInfo property. By default, collectionInfo is not included.
     * 
     */
    @Import(name="expand")
    private @Nullable String expand;

    /**
     * @return May be used to expand the collectionInfo property. By default, collectionInfo is not included.
     * 
     */
    public Optional<String> expand() {
        return Optional.ofNullable(this.expand);
    }

    private GetCloudConnectorPlainArgs() {}

    private GetCloudConnectorPlainArgs(GetCloudConnectorPlainArgs $) {
        this.connectorName = $.connectorName;
        this.expand = $.expand;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudConnectorPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudConnectorPlainArgs $;

        public Builder() {
            $ = new GetCloudConnectorPlainArgs();
        }

        public Builder(GetCloudConnectorPlainArgs defaults) {
            $ = new GetCloudConnectorPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectorName Connector Name.
         * 
         * @return builder
         * 
         */
        public Builder connectorName(String connectorName) {
            $.connectorName = connectorName;
            return this;
        }

        /**
         * @param expand May be used to expand the collectionInfo property. By default, collectionInfo is not included.
         * 
         * @return builder
         * 
         */
        public Builder expand(@Nullable String expand) {
            $.expand = expand;
            return this;
        }

        public GetCloudConnectorPlainArgs build() {
            $.connectorName = Objects.requireNonNull($.connectorName, "expected parameter 'connectorName' to be non-null");
            return $;
        }
    }

}
