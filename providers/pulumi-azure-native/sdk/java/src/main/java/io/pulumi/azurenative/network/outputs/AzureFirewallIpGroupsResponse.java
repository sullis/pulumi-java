// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AzureFirewallIpGroupsResponse {
    /**
     * The iteration number.
     * 
     */
    private final String changeNumber;
    /**
     * Resource ID.
     * 
     */
    private final String id;

    @OutputCustomType.Constructor({"changeNumber","id"})
    private AzureFirewallIpGroupsResponse(
        String changeNumber,
        String id) {
        this.changeNumber = Objects.requireNonNull(changeNumber);
        this.id = Objects.requireNonNull(id);
    }

    /**
     * The iteration number.
     * 
     */
    public String getChangeNumber() {
        return this.changeNumber;
    }
    /**
     * Resource ID.
     * 
     */
    public String getId() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFirewallIpGroupsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String changeNumber;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFirewallIpGroupsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.changeNumber = defaults.changeNumber;
    	      this.id = defaults.id;
        }

        public Builder setChangeNumber(String changeNumber) {
            this.changeNumber = Objects.requireNonNull(changeNumber);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public AzureFirewallIpGroupsResponse build() {
            return new AzureFirewallIpGroupsResponse(changeNumber, id);
        }
    }
}
