// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetGcpUserAccessBindingResult {
    /**
     * Access level that a user must have to be granted access. Only one access level is supported, not multiple. This repeated field must have exactly one element. Example: "accessPolicies/9522/accessLevels/device_trusted"
     * 
     */
    private final List<String> accessLevels;
    /**
     * Immutable. Google Group id whose members are subject to this binding's restrictions. See "id" in the [G Suite Directory API's Groups resource] (https://developers.google.com/admin-sdk/directory/v1/reference/groups#resource). If a group's email address/alias is changed, this resource will continue to point at the changed group. This field does not accept group email addresses or aliases. Example: "01d520gv4vjcrht"
     * 
     */
    private final String groupKey;
    /**
     * Immutable. Assigned by the server during creation. The last segment has an arbitrary length and has only URI unreserved characters (as defined by [RFC 3986 Section 2.3](https://tools.ietf.org/html/rfc3986#section-2.3)). Should not be specified by the client during creation. Example: "organizations/256/gcpUserAccessBindings/b3-BhcX_Ud5N"
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"accessLevels","groupKey","name"})
    private GetGcpUserAccessBindingResult(
        List<String> accessLevels,
        String groupKey,
        String name) {
        this.accessLevels = Objects.requireNonNull(accessLevels);
        this.groupKey = Objects.requireNonNull(groupKey);
        this.name = Objects.requireNonNull(name);
    }

    /**
     * Access level that a user must have to be granted access. Only one access level is supported, not multiple. This repeated field must have exactly one element. Example: "accessPolicies/9522/accessLevels/device_trusted"
     * 
    */
    public List<String> getAccessLevels() {
        return this.accessLevels;
    }
    /**
     * Immutable. Google Group id whose members are subject to this binding's restrictions. See "id" in the [G Suite Directory API's Groups resource] (https://developers.google.com/admin-sdk/directory/v1/reference/groups#resource). If a group's email address/alias is changed, this resource will continue to point at the changed group. This field does not accept group email addresses or aliases. Example: "01d520gv4vjcrht"
     * 
    */
    public String getGroupKey() {
        return this.groupKey;
    }
    /**
     * Immutable. Assigned by the server during creation. The last segment has an arbitrary length and has only URI unreserved characters (as defined by [RFC 3986 Section 2.3](https://tools.ietf.org/html/rfc3986#section-2.3)). Should not be specified by the client during creation. Example: "organizations/256/gcpUserAccessBindings/b3-BhcX_Ud5N"
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGcpUserAccessBindingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> accessLevels;
        private String groupKey;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGcpUserAccessBindingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLevels = defaults.accessLevels;
    	      this.groupKey = defaults.groupKey;
    	      this.name = defaults.name;
        }

        public Builder setAccessLevels(List<String> accessLevels) {
            this.accessLevels = Objects.requireNonNull(accessLevels);
            return this;
        }

        public Builder setGroupKey(String groupKey) {
            this.groupKey = Objects.requireNonNull(groupKey);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetGcpUserAccessBindingResult build() {
            return new GetGcpUserAccessBindingResult(accessLevels, groupKey, name);
        }
    }
}