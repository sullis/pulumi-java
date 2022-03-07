// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deviceupdate.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ConnectionDetailsResponse {
    /**
     * Group ID.
     * 
     */
    private final String groupId;
    /**
     * Connection details ID.
     * 
     */
    private final String id;
    /**
     * Link ID.
     * 
     */
    private final String linkIdentifier;
    /**
     * Member name.
     * 
     */
    private final String memberName;
    /**
     * Private IP address.
     * 
     */
    private final String privateIpAddress;

    @OutputCustomType.Constructor({"groupId","id","linkIdentifier","memberName","privateIpAddress"})
    private ConnectionDetailsResponse(
        String groupId,
        String id,
        String linkIdentifier,
        String memberName,
        String privateIpAddress) {
        this.groupId = Objects.requireNonNull(groupId);
        this.id = Objects.requireNonNull(id);
        this.linkIdentifier = Objects.requireNonNull(linkIdentifier);
        this.memberName = Objects.requireNonNull(memberName);
        this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
    }

    /**
     * Group ID.
     * 
    */
    public String getGroupId() {
        return this.groupId;
    }
    /**
     * Connection details ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Link ID.
     * 
    */
    public String getLinkIdentifier() {
        return this.linkIdentifier;
    }
    /**
     * Member name.
     * 
    */
    public String getMemberName() {
        return this.memberName;
    }
    /**
     * Private IP address.
     * 
    */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String groupId;
        private String id;
        private String linkIdentifier;
        private String memberName;
        private String privateIpAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.id = defaults.id;
    	      this.linkIdentifier = defaults.linkIdentifier;
    	      this.memberName = defaults.memberName;
    	      this.privateIpAddress = defaults.privateIpAddress;
        }

        public Builder setGroupId(String groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLinkIdentifier(String linkIdentifier) {
            this.linkIdentifier = Objects.requireNonNull(linkIdentifier);
            return this;
        }

        public Builder setMemberName(String memberName) {
            this.memberName = Objects.requireNonNull(memberName);
            return this;
        }

        public Builder setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
            return this;
        }
        public ConnectionDetailsResponse build() {
            return new ConnectionDetailsResponse(groupId, id, linkIdentifier, memberName, privateIpAddress);
        }
    }
}