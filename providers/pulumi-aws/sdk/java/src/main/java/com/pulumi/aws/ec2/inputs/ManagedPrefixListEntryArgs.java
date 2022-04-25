// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedPrefixListEntryArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedPrefixListEntryArgs Empty = new ManagedPrefixListEntryArgs();

    /**
     * CIDR block of this entry.
     * 
     */
    @Import(name="cidr", required=true)
    private Output<String> cidr;

    /**
     * @return CIDR block of this entry.
     * 
     */
    public Output<String> cidr() {
        return this.cidr;
    }

    /**
     * Description of this entry. Due to API limitations, updating only the description of an existing entry requires temporarily removing and re-adding the entry.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of this entry. Due to API limitations, updating only the description of an existing entry requires temporarily removing and re-adding the entry.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    private ManagedPrefixListEntryArgs() {}

    private ManagedPrefixListEntryArgs(ManagedPrefixListEntryArgs $) {
        this.cidr = $.cidr;
        this.description = $.description;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedPrefixListEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedPrefixListEntryArgs $;

        public Builder() {
            $ = new ManagedPrefixListEntryArgs();
        }

        public Builder(ManagedPrefixListEntryArgs defaults) {
            $ = new ManagedPrefixListEntryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cidr CIDR block of this entry.
         * 
         * @return builder
         * 
         */
        public Builder cidr(Output<String> cidr) {
            $.cidr = cidr;
            return this;
        }

        /**
         * @param cidr CIDR block of this entry.
         * 
         * @return builder
         * 
         */
        public Builder cidr(String cidr) {
            return cidr(Output.of(cidr));
        }

        /**
         * @param description Description of this entry. Due to API limitations, updating only the description of an existing entry requires temporarily removing and re-adding the entry.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of this entry. Due to API limitations, updating only the description of an existing entry requires temporarily removing and re-adding the entry.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        public ManagedPrefixListEntryArgs build() {
            $.cidr = Objects.requireNonNull($.cidr, "expected parameter 'cidr' to be non-null");
            return $;
        }
    }

}
