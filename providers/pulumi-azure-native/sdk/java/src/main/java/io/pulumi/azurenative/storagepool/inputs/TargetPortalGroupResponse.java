// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagepool.inputs;

import io.pulumi.azurenative.storagepool.inputs.AclResponse;
import io.pulumi.azurenative.storagepool.inputs.AttributesResponse;
import io.pulumi.azurenative.storagepool.inputs.IscsiLunResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Response properties for iSCSI target portal group.
 * 
 */
public final class TargetPortalGroupResponse extends io.pulumi.resources.InvokeArgs {

    public static final TargetPortalGroupResponse Empty = new TargetPortalGroupResponse();

    /**
     * Access Control List (ACL) for an iSCSI target portal group.
     * 
     */
    @InputImport(name="acls", required=true)
    private final List<AclResponse> acls;

    public List<AclResponse> getAcls() {
        return this.acls;
    }

    /**
     * Attributes of an iSCSI target portal group.
     * 
     */
    @InputImport(name="attributes", required=true)
    private final AttributesResponse attributes;

    public AttributesResponse getAttributes() {
        return this.attributes;
    }

    /**
     * List of private IPv4 addresses to connect to the iSCSI target.
     * 
     */
    @InputImport(name="endpoints", required=true)
    private final List<String> endpoints;

    public List<String> getEndpoints() {
        return this.endpoints;
    }

    /**
     * List of LUNs to be exposed through iSCSI target portal group.
     * 
     */
    @InputImport(name="luns", required=true)
    private final List<IscsiLunResponse> luns;

    public List<IscsiLunResponse> getLuns() {
        return this.luns;
    }

    /**
     * The port used by iSCSI target portal group.
     * 
     */
    @InputImport(name="port", required=true)
    private final Integer port;

    public Integer getPort() {
        return this.port;
    }

    /**
     * The tag associated with the iSCSI target portal group.
     * 
     */
    @InputImport(name="tag", required=true)
    private final Integer tag;

    public Integer getTag() {
        return this.tag;
    }

    public TargetPortalGroupResponse(
        List<AclResponse> acls,
        AttributesResponse attributes,
        List<String> endpoints,
        List<IscsiLunResponse> luns,
        Integer port,
        Integer tag) {
        this.acls = Objects.requireNonNull(acls, "expected parameter 'acls' to be non-null");
        this.attributes = Objects.requireNonNull(attributes, "expected parameter 'attributes' to be non-null");
        this.endpoints = Objects.requireNonNull(endpoints, "expected parameter 'endpoints' to be non-null");
        this.luns = Objects.requireNonNull(luns, "expected parameter 'luns' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.tag = Objects.requireNonNull(tag, "expected parameter 'tag' to be non-null");
    }

    private TargetPortalGroupResponse() {
        this.acls = List.of();
        this.attributes = null;
        this.endpoints = List.of();
        this.luns = List.of();
        this.port = null;
        this.tag = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetPortalGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AclResponse> acls;
        private AttributesResponse attributes;
        private List<String> endpoints;
        private List<IscsiLunResponse> luns;
        private Integer port;
        private Integer tag;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetPortalGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acls = defaults.acls;
    	      this.attributes = defaults.attributes;
    	      this.endpoints = defaults.endpoints;
    	      this.luns = defaults.luns;
    	      this.port = defaults.port;
    	      this.tag = defaults.tag;
        }

        public Builder setAcls(List<AclResponse> acls) {
            this.acls = Objects.requireNonNull(acls);
            return this;
        }

        public Builder setAttributes(AttributesResponse attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }

        public Builder setEndpoints(List<String> endpoints) {
            this.endpoints = Objects.requireNonNull(endpoints);
            return this;
        }

        public Builder setLuns(List<IscsiLunResponse> luns) {
            this.luns = Objects.requireNonNull(luns);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setTag(Integer tag) {
            this.tag = Objects.requireNonNull(tag);
            return this;
        }

        public TargetPortalGroupResponse build() {
            return new TargetPortalGroupResponse(acls, attributes, endpoints, luns, port, tag);
        }
    }
}
