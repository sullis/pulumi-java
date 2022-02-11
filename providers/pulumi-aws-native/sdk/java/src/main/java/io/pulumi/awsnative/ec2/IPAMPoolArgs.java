// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.ec2.inputs.IPAMPoolProvisionedCidrArgs;
import io.pulumi.awsnative.ec2.inputs.IPAMPoolTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IPAMPoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final IPAMPoolArgs Empty = new IPAMPoolArgs();

    @InputImport(name="addressFamily", required=true)
    private final Input<String> addressFamily;

    public Input<String> getAddressFamily() {
        return this.addressFamily;
    }

    @InputImport(name="allocationDefaultNetmaskLength")
    private final @Nullable Input<Integer> allocationDefaultNetmaskLength;

    public Input<Integer> getAllocationDefaultNetmaskLength() {
        return this.allocationDefaultNetmaskLength == null ? Input.empty() : this.allocationDefaultNetmaskLength;
    }

    @InputImport(name="allocationMaxNetmaskLength")
    private final @Nullable Input<Integer> allocationMaxNetmaskLength;

    public Input<Integer> getAllocationMaxNetmaskLength() {
        return this.allocationMaxNetmaskLength == null ? Input.empty() : this.allocationMaxNetmaskLength;
    }

    @InputImport(name="allocationMinNetmaskLength")
    private final @Nullable Input<Integer> allocationMinNetmaskLength;

    public Input<Integer> getAllocationMinNetmaskLength() {
        return this.allocationMinNetmaskLength == null ? Input.empty() : this.allocationMinNetmaskLength;
    }

    @InputImport(name="allocationResourceTags")
    private final @Nullable Input<List<IPAMPoolTagArgs>> allocationResourceTags;

    public Input<List<IPAMPoolTagArgs>> getAllocationResourceTags() {
        return this.allocationResourceTags == null ? Input.empty() : this.allocationResourceTags;
    }

    @InputImport(name="autoImport")
    private final @Nullable Input<Boolean> autoImport;

    public Input<Boolean> getAutoImport() {
        return this.autoImport == null ? Input.empty() : this.autoImport;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="ipamScopeId", required=true)
    private final Input<String> ipamScopeId;

    public Input<String> getIpamScopeId() {
        return this.ipamScopeId;
    }

    @InputImport(name="locale")
    private final @Nullable Input<String> locale;

    public Input<String> getLocale() {
        return this.locale == null ? Input.empty() : this.locale;
    }

    @InputImport(name="provisionedCidrs")
    private final @Nullable Input<List<IPAMPoolProvisionedCidrArgs>> provisionedCidrs;

    public Input<List<IPAMPoolProvisionedCidrArgs>> getProvisionedCidrs() {
        return this.provisionedCidrs == null ? Input.empty() : this.provisionedCidrs;
    }

    @InputImport(name="publiclyAdvertisable")
    private final @Nullable Input<Boolean> publiclyAdvertisable;

    public Input<Boolean> getPubliclyAdvertisable() {
        return this.publiclyAdvertisable == null ? Input.empty() : this.publiclyAdvertisable;
    }

    @InputImport(name="sourceIpamPoolId")
    private final @Nullable Input<String> sourceIpamPoolId;

    public Input<String> getSourceIpamPoolId() {
        return this.sourceIpamPoolId == null ? Input.empty() : this.sourceIpamPoolId;
    }

    @InputImport(name="tags")
    private final @Nullable Input<List<IPAMPoolTagArgs>> tags;

    public Input<List<IPAMPoolTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public IPAMPoolArgs(
        Input<String> addressFamily,
        @Nullable Input<Integer> allocationDefaultNetmaskLength,
        @Nullable Input<Integer> allocationMaxNetmaskLength,
        @Nullable Input<Integer> allocationMinNetmaskLength,
        @Nullable Input<List<IPAMPoolTagArgs>> allocationResourceTags,
        @Nullable Input<Boolean> autoImport,
        @Nullable Input<String> description,
        Input<String> ipamScopeId,
        @Nullable Input<String> locale,
        @Nullable Input<List<IPAMPoolProvisionedCidrArgs>> provisionedCidrs,
        @Nullable Input<Boolean> publiclyAdvertisable,
        @Nullable Input<String> sourceIpamPoolId,
        @Nullable Input<List<IPAMPoolTagArgs>> tags) {
        this.addressFamily = Objects.requireNonNull(addressFamily, "expected parameter 'addressFamily' to be non-null");
        this.allocationDefaultNetmaskLength = allocationDefaultNetmaskLength;
        this.allocationMaxNetmaskLength = allocationMaxNetmaskLength;
        this.allocationMinNetmaskLength = allocationMinNetmaskLength;
        this.allocationResourceTags = allocationResourceTags;
        this.autoImport = autoImport;
        this.description = description;
        this.ipamScopeId = Objects.requireNonNull(ipamScopeId, "expected parameter 'ipamScopeId' to be non-null");
        this.locale = locale;
        this.provisionedCidrs = provisionedCidrs;
        this.publiclyAdvertisable = publiclyAdvertisable;
        this.sourceIpamPoolId = sourceIpamPoolId;
        this.tags = tags;
    }

    private IPAMPoolArgs() {
        this.addressFamily = Input.empty();
        this.allocationDefaultNetmaskLength = Input.empty();
        this.allocationMaxNetmaskLength = Input.empty();
        this.allocationMinNetmaskLength = Input.empty();
        this.allocationResourceTags = Input.empty();
        this.autoImport = Input.empty();
        this.description = Input.empty();
        this.ipamScopeId = Input.empty();
        this.locale = Input.empty();
        this.provisionedCidrs = Input.empty();
        this.publiclyAdvertisable = Input.empty();
        this.sourceIpamPoolId = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPAMPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> addressFamily;
        private @Nullable Input<Integer> allocationDefaultNetmaskLength;
        private @Nullable Input<Integer> allocationMaxNetmaskLength;
        private @Nullable Input<Integer> allocationMinNetmaskLength;
        private @Nullable Input<List<IPAMPoolTagArgs>> allocationResourceTags;
        private @Nullable Input<Boolean> autoImport;
        private @Nullable Input<String> description;
        private Input<String> ipamScopeId;
        private @Nullable Input<String> locale;
        private @Nullable Input<List<IPAMPoolProvisionedCidrArgs>> provisionedCidrs;
        private @Nullable Input<Boolean> publiclyAdvertisable;
        private @Nullable Input<String> sourceIpamPoolId;
        private @Nullable Input<List<IPAMPoolTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(IPAMPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressFamily = defaults.addressFamily;
    	      this.allocationDefaultNetmaskLength = defaults.allocationDefaultNetmaskLength;
    	      this.allocationMaxNetmaskLength = defaults.allocationMaxNetmaskLength;
    	      this.allocationMinNetmaskLength = defaults.allocationMinNetmaskLength;
    	      this.allocationResourceTags = defaults.allocationResourceTags;
    	      this.autoImport = defaults.autoImport;
    	      this.description = defaults.description;
    	      this.ipamScopeId = defaults.ipamScopeId;
    	      this.locale = defaults.locale;
    	      this.provisionedCidrs = defaults.provisionedCidrs;
    	      this.publiclyAdvertisable = defaults.publiclyAdvertisable;
    	      this.sourceIpamPoolId = defaults.sourceIpamPoolId;
    	      this.tags = defaults.tags;
        }

        public Builder setAddressFamily(Input<String> addressFamily) {
            this.addressFamily = Objects.requireNonNull(addressFamily);
            return this;
        }

        public Builder setAddressFamily(String addressFamily) {
            this.addressFamily = Input.of(Objects.requireNonNull(addressFamily));
            return this;
        }

        public Builder setAllocationDefaultNetmaskLength(@Nullable Input<Integer> allocationDefaultNetmaskLength) {
            this.allocationDefaultNetmaskLength = allocationDefaultNetmaskLength;
            return this;
        }

        public Builder setAllocationDefaultNetmaskLength(@Nullable Integer allocationDefaultNetmaskLength) {
            this.allocationDefaultNetmaskLength = Input.ofNullable(allocationDefaultNetmaskLength);
            return this;
        }

        public Builder setAllocationMaxNetmaskLength(@Nullable Input<Integer> allocationMaxNetmaskLength) {
            this.allocationMaxNetmaskLength = allocationMaxNetmaskLength;
            return this;
        }

        public Builder setAllocationMaxNetmaskLength(@Nullable Integer allocationMaxNetmaskLength) {
            this.allocationMaxNetmaskLength = Input.ofNullable(allocationMaxNetmaskLength);
            return this;
        }

        public Builder setAllocationMinNetmaskLength(@Nullable Input<Integer> allocationMinNetmaskLength) {
            this.allocationMinNetmaskLength = allocationMinNetmaskLength;
            return this;
        }

        public Builder setAllocationMinNetmaskLength(@Nullable Integer allocationMinNetmaskLength) {
            this.allocationMinNetmaskLength = Input.ofNullable(allocationMinNetmaskLength);
            return this;
        }

        public Builder setAllocationResourceTags(@Nullable Input<List<IPAMPoolTagArgs>> allocationResourceTags) {
            this.allocationResourceTags = allocationResourceTags;
            return this;
        }

        public Builder setAllocationResourceTags(@Nullable List<IPAMPoolTagArgs> allocationResourceTags) {
            this.allocationResourceTags = Input.ofNullable(allocationResourceTags);
            return this;
        }

        public Builder setAutoImport(@Nullable Input<Boolean> autoImport) {
            this.autoImport = autoImport;
            return this;
        }

        public Builder setAutoImport(@Nullable Boolean autoImport) {
            this.autoImport = Input.ofNullable(autoImport);
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

        public Builder setIpamScopeId(Input<String> ipamScopeId) {
            this.ipamScopeId = Objects.requireNonNull(ipamScopeId);
            return this;
        }

        public Builder setIpamScopeId(String ipamScopeId) {
            this.ipamScopeId = Input.of(Objects.requireNonNull(ipamScopeId));
            return this;
        }

        public Builder setLocale(@Nullable Input<String> locale) {
            this.locale = locale;
            return this;
        }

        public Builder setLocale(@Nullable String locale) {
            this.locale = Input.ofNullable(locale);
            return this;
        }

        public Builder setProvisionedCidrs(@Nullable Input<List<IPAMPoolProvisionedCidrArgs>> provisionedCidrs) {
            this.provisionedCidrs = provisionedCidrs;
            return this;
        }

        public Builder setProvisionedCidrs(@Nullable List<IPAMPoolProvisionedCidrArgs> provisionedCidrs) {
            this.provisionedCidrs = Input.ofNullable(provisionedCidrs);
            return this;
        }

        public Builder setPubliclyAdvertisable(@Nullable Input<Boolean> publiclyAdvertisable) {
            this.publiclyAdvertisable = publiclyAdvertisable;
            return this;
        }

        public Builder setPubliclyAdvertisable(@Nullable Boolean publiclyAdvertisable) {
            this.publiclyAdvertisable = Input.ofNullable(publiclyAdvertisable);
            return this;
        }

        public Builder setSourceIpamPoolId(@Nullable Input<String> sourceIpamPoolId) {
            this.sourceIpamPoolId = sourceIpamPoolId;
            return this;
        }

        public Builder setSourceIpamPoolId(@Nullable String sourceIpamPoolId) {
            this.sourceIpamPoolId = Input.ofNullable(sourceIpamPoolId);
            return this;
        }

        public Builder setTags(@Nullable Input<List<IPAMPoolTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<IPAMPoolTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public IPAMPoolArgs build() {
            return new IPAMPoolArgs(addressFamily, allocationDefaultNetmaskLength, allocationMaxNetmaskLength, allocationMinNetmaskLength, allocationResourceTags, autoImport, description, ipamScopeId, locale, provisionedCidrs, publiclyAdvertisable, sourceIpamPoolId, tags);
        }
    }
}
