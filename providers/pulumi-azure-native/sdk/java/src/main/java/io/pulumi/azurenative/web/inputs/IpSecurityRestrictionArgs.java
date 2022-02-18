// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.enums.IpFilterTag;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * IP security restriction on an app.
 * 
 */
public final class IpSecurityRestrictionArgs extends io.pulumi.resources.ResourceArgs {

    public static final IpSecurityRestrictionArgs Empty = new IpSecurityRestrictionArgs();

    /**
     * Allow or Deny access for this IP range.
     * 
     */
    @InputImport(name="action")
    private final @Nullable Input<String> action;

    public Input<String> getAction() {
        return this.action == null ? Input.empty() : this.action;
    }

    /**
     * IP restriction rule description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * IP restriction rule headers.
     * X-Forwarded-Host (https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Forwarded-Host#Examples).
     * The matching logic is ..
     * - If the property is null or empty (default), all hosts(or lack of) are allowed.
     * - A value is compared using ordinal-ignore-case (excluding port number).
     * - Subdomain wildcards are permitted but don't match the root domain. For example, *.contoso.com matches the subdomain foo.contoso.com
     *    but not the root domain contoso.com or multi-level foo.bar.contoso.com
     * - Unicode host names are allowed but are converted to Punycode for matching.
     * 
     * X-Forwarded-For (https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Forwarded-For#Examples).
     * The matching logic is ..
     * - If the property is null or empty (default), any forwarded-for chains (or lack of) are allowed.
     * - If any address (excluding port number) in the chain (comma separated) matches the CIDR defined by the property.
     * 
     * X-Azure-FDID and X-FD-HealthProbe.
     * The matching logic is exact match.
     * 
     */
    @InputImport(name="headers")
    private final @Nullable Input<Map<String,List<String>>> headers;

    public Input<Map<String,List<String>>> getHeaders() {
        return this.headers == null ? Input.empty() : this.headers;
    }

    /**
     * IP address the security restriction is valid for.
     * It can be in form of pure ipv4 address (required SubnetMask property) or
     * CIDR notation such as ipv4/mask (leading bit match). For CIDR,
     * SubnetMask property must not be specified.
     * 
     */
    @InputImport(name="ipAddress")
    private final @Nullable Input<String> ipAddress;

    public Input<String> getIpAddress() {
        return this.ipAddress == null ? Input.empty() : this.ipAddress;
    }

    /**
     * IP restriction rule name.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Priority of IP restriction rule.
     * 
     */
    @InputImport(name="priority")
    private final @Nullable Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    /**
     * Subnet mask for the range of IP addresses the restriction is valid for.
     * 
     */
    @InputImport(name="subnetMask")
    private final @Nullable Input<String> subnetMask;

    public Input<String> getSubnetMask() {
        return this.subnetMask == null ? Input.empty() : this.subnetMask;
    }

    /**
     * (internal) Subnet traffic tag
     * 
     */
    @InputImport(name="subnetTrafficTag")
    private final @Nullable Input<Integer> subnetTrafficTag;

    public Input<Integer> getSubnetTrafficTag() {
        return this.subnetTrafficTag == null ? Input.empty() : this.subnetTrafficTag;
    }

    /**
     * Defines what this IP filter will be used for. This is to support IP filtering on proxies.
     * 
     */
    @InputImport(name="tag")
    private final @Nullable Input<Either<String,IpFilterTag>> tag;

    public Input<Either<String,IpFilterTag>> getTag() {
        return this.tag == null ? Input.empty() : this.tag;
    }

    /**
     * Virtual network resource id
     * 
     */
    @InputImport(name="vnetSubnetResourceId")
    private final @Nullable Input<String> vnetSubnetResourceId;

    public Input<String> getVnetSubnetResourceId() {
        return this.vnetSubnetResourceId == null ? Input.empty() : this.vnetSubnetResourceId;
    }

    /**
     * (internal) Vnet traffic tag
     * 
     */
    @InputImport(name="vnetTrafficTag")
    private final @Nullable Input<Integer> vnetTrafficTag;

    public Input<Integer> getVnetTrafficTag() {
        return this.vnetTrafficTag == null ? Input.empty() : this.vnetTrafficTag;
    }

    public IpSecurityRestrictionArgs(
        @Nullable Input<String> action,
        @Nullable Input<String> description,
        @Nullable Input<Map<String,List<String>>> headers,
        @Nullable Input<String> ipAddress,
        @Nullable Input<String> name,
        @Nullable Input<Integer> priority,
        @Nullable Input<String> subnetMask,
        @Nullable Input<Integer> subnetTrafficTag,
        @Nullable Input<Either<String,IpFilterTag>> tag,
        @Nullable Input<String> vnetSubnetResourceId,
        @Nullable Input<Integer> vnetTrafficTag) {
        this.action = action;
        this.description = description;
        this.headers = headers;
        this.ipAddress = ipAddress;
        this.name = name;
        this.priority = priority;
        this.subnetMask = subnetMask;
        this.subnetTrafficTag = subnetTrafficTag;
        this.tag = tag;
        this.vnetSubnetResourceId = vnetSubnetResourceId;
        this.vnetTrafficTag = vnetTrafficTag;
    }

    private IpSecurityRestrictionArgs() {
        this.action = Input.empty();
        this.description = Input.empty();
        this.headers = Input.empty();
        this.ipAddress = Input.empty();
        this.name = Input.empty();
        this.priority = Input.empty();
        this.subnetMask = Input.empty();
        this.subnetTrafficTag = Input.empty();
        this.tag = Input.empty();
        this.vnetSubnetResourceId = Input.empty();
        this.vnetTrafficTag = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpSecurityRestrictionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> action;
        private @Nullable Input<String> description;
        private @Nullable Input<Map<String,List<String>>> headers;
        private @Nullable Input<String> ipAddress;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> priority;
        private @Nullable Input<String> subnetMask;
        private @Nullable Input<Integer> subnetTrafficTag;
        private @Nullable Input<Either<String,IpFilterTag>> tag;
        private @Nullable Input<String> vnetSubnetResourceId;
        private @Nullable Input<Integer> vnetTrafficTag;

        public Builder() {
    	      // Empty
        }

        public Builder(IpSecurityRestrictionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.description = defaults.description;
    	      this.headers = defaults.headers;
    	      this.ipAddress = defaults.ipAddress;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.subnetMask = defaults.subnetMask;
    	      this.subnetTrafficTag = defaults.subnetTrafficTag;
    	      this.tag = defaults.tag;
    	      this.vnetSubnetResourceId = defaults.vnetSubnetResourceId;
    	      this.vnetTrafficTag = defaults.vnetTrafficTag;
        }

        public Builder setAction(@Nullable Input<String> action) {
            this.action = action;
            return this;
        }

        public Builder setAction(@Nullable String action) {
            this.action = Input.ofNullable(action);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setHeaders(@Nullable Input<Map<String,List<String>>> headers) {
            this.headers = headers;
            return this;
        }

        public Builder setHeaders(@Nullable Map<String,List<String>> headers) {
            this.headers = Input.ofNullable(headers);
            return this;
        }

        public Builder setIpAddress(@Nullable Input<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = Input.ofNullable(ipAddress);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPriority(@Nullable Input<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = Input.ofNullable(priority);
            return this;
        }

        public Builder setSubnetMask(@Nullable Input<String> subnetMask) {
            this.subnetMask = subnetMask;
            return this;
        }

        public Builder setSubnetMask(@Nullable String subnetMask) {
            this.subnetMask = Input.ofNullable(subnetMask);
            return this;
        }

        public Builder setSubnetTrafficTag(@Nullable Input<Integer> subnetTrafficTag) {
            this.subnetTrafficTag = subnetTrafficTag;
            return this;
        }

        public Builder setSubnetTrafficTag(@Nullable Integer subnetTrafficTag) {
            this.subnetTrafficTag = Input.ofNullable(subnetTrafficTag);
            return this;
        }

        public Builder setTag(@Nullable Input<Either<String,IpFilterTag>> tag) {
            this.tag = tag;
            return this;
        }

        public Builder setTag(@Nullable Either<String,IpFilterTag> tag) {
            this.tag = Input.ofNullable(tag);
            return this;
        }

        public Builder setVnetSubnetResourceId(@Nullable Input<String> vnetSubnetResourceId) {
            this.vnetSubnetResourceId = vnetSubnetResourceId;
            return this;
        }

        public Builder setVnetSubnetResourceId(@Nullable String vnetSubnetResourceId) {
            this.vnetSubnetResourceId = Input.ofNullable(vnetSubnetResourceId);
            return this;
        }

        public Builder setVnetTrafficTag(@Nullable Input<Integer> vnetTrafficTag) {
            this.vnetTrafficTag = vnetTrafficTag;
            return this;
        }

        public Builder setVnetTrafficTag(@Nullable Integer vnetTrafficTag) {
            this.vnetTrafficTag = Input.ofNullable(vnetTrafficTag);
            return this;
        }

        public IpSecurityRestrictionArgs build() {
            return new IpSecurityRestrictionArgs(action, description, headers, ipAddress, name, priority, subnetMask, subnetTrafficTag, tag, vnetSubnetResourceId, vnetTrafficTag);
        }
    }
}
