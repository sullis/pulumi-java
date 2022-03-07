// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagepool.outputs;

import io.pulumi.azurenative.storagepool.outputs.AclResponse;
import io.pulumi.azurenative.storagepool.outputs.AttributesResponse;
import io.pulumi.azurenative.storagepool.outputs.IscsiLunResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class TargetPortalGroupResponse {
    /**
     * Access Control List (ACL) for an iSCSI target portal group.
     * 
     */
    private final List<AclResponse> acls;
    /**
     * Attributes of an iSCSI target portal group.
     * 
     */
    private final AttributesResponse attributes;
    /**
     * List of private IPv4 addresses to connect to the iSCSI target.
     * 
     */
    private final List<String> endpoints;
    /**
     * List of LUNs to be exposed through iSCSI target portal group.
     * 
     */
    private final List<IscsiLunResponse> luns;
    /**
     * The port used by iSCSI target portal group.
     * 
     */
    private final Integer port;
    /**
     * The tag associated with the iSCSI target portal group.
     * 
     */
    private final Integer tag;

    @OutputCustomType.Constructor({"acls","attributes","endpoints","luns","port","tag"})
    private TargetPortalGroupResponse(
        List<AclResponse> acls,
        AttributesResponse attributes,
        List<String> endpoints,
        List<IscsiLunResponse> luns,
        Integer port,
        Integer tag) {
        this.acls = Objects.requireNonNull(acls);
        this.attributes = Objects.requireNonNull(attributes);
        this.endpoints = Objects.requireNonNull(endpoints);
        this.luns = Objects.requireNonNull(luns);
        this.port = Objects.requireNonNull(port);
        this.tag = Objects.requireNonNull(tag);
    }

    /**
     * Access Control List (ACL) for an iSCSI target portal group.
     * 
    */
    public List<AclResponse> getAcls() {
        return this.acls;
    }
    /**
     * Attributes of an iSCSI target portal group.
     * 
    */
    public AttributesResponse getAttributes() {
        return this.attributes;
    }
    /**
     * List of private IPv4 addresses to connect to the iSCSI target.
     * 
    */
    public List<String> getEndpoints() {
        return this.endpoints;
    }
    /**
     * List of LUNs to be exposed through iSCSI target portal group.
     * 
    */
    public List<IscsiLunResponse> getLuns() {
        return this.luns;
    }
    /**
     * The port used by iSCSI target portal group.
     * 
    */
    public Integer getPort() {
        return this.port;
    }
    /**
     * The tag associated with the iSCSI target portal group.
     * 
    */
    public Integer getTag() {
        return this.tag;
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