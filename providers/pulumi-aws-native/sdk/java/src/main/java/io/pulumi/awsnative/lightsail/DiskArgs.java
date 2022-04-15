// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail;

import io.pulumi.awsnative.lightsail.inputs.DiskAddOnArgs;
import io.pulumi.awsnative.lightsail.inputs.DiskTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiskArgs Empty = new DiskArgs();

    /**
     * An array of objects representing the add-ons to enable for the new instance.
     * 
     */
    @Import(name="addOns")
      private final @Nullable Output<List<DiskAddOnArgs>> addOns;

    public Output<List<DiskAddOnArgs>> addOns() {
        return this.addOns == null ? Codegen.empty() : this.addOns;
    }

    /**
     * The Availability Zone in which to create your instance. Use the following format: us-east-2a (case sensitive). Be sure to add the include Availability Zones parameter to your request.
     * 
     */
    @Import(name="availabilityZone")
      private final @Nullable Output<String> availabilityZone;

    public Output<String> availabilityZone() {
        return this.availabilityZone == null ? Codegen.empty() : this.availabilityZone;
    }

    /**
     * The names to use for your new Lightsail disk.
     * 
     */
    @Import(name="diskName")
      private final @Nullable Output<String> diskName;

    public Output<String> diskName() {
        return this.diskName == null ? Codegen.empty() : this.diskName;
    }

    /**
     * Size of the Lightsail disk
     * 
     */
    @Import(name="sizeInGb", required=true)
      private final Output<Integer> sizeInGb;

    public Output<Integer> sizeInGb() {
        return this.sizeInGb;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<DiskTagArgs>> tags;

    public Output<List<DiskTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public DiskArgs(
        @Nullable Output<List<DiskAddOnArgs>> addOns,
        @Nullable Output<String> availabilityZone,
        @Nullable Output<String> diskName,
        Output<Integer> sizeInGb,
        @Nullable Output<List<DiskTagArgs>> tags) {
        this.addOns = addOns;
        this.availabilityZone = availabilityZone;
        this.diskName = diskName;
        this.sizeInGb = Objects.requireNonNull(sizeInGb, "expected parameter 'sizeInGb' to be non-null");
        this.tags = tags;
    }

    private DiskArgs() {
        this.addOns = Codegen.empty();
        this.availabilityZone = Codegen.empty();
        this.diskName = Codegen.empty();
        this.sizeInGb = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<DiskAddOnArgs>> addOns;
        private @Nullable Output<String> availabilityZone;
        private @Nullable Output<String> diskName;
        private Output<Integer> sizeInGb;
        private @Nullable Output<List<DiskTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addOns = defaults.addOns;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.diskName = defaults.diskName;
    	      this.sizeInGb = defaults.sizeInGb;
    	      this.tags = defaults.tags;
        }

        public Builder addOns(@Nullable Output<List<DiskAddOnArgs>> addOns) {
            this.addOns = addOns;
            return this;
        }
        public Builder addOns(@Nullable List<DiskAddOnArgs> addOns) {
            this.addOns = Codegen.ofNullable(addOns);
            return this;
        }
        public Builder addOns(DiskAddOnArgs... addOns) {
            return addOns(List.of(addOns));
        }
        public Builder availabilityZone(@Nullable Output<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Codegen.ofNullable(availabilityZone);
            return this;
        }
        public Builder diskName(@Nullable Output<String> diskName) {
            this.diskName = diskName;
            return this;
        }
        public Builder diskName(@Nullable String diskName) {
            this.diskName = Codegen.ofNullable(diskName);
            return this;
        }
        public Builder sizeInGb(Output<Integer> sizeInGb) {
            this.sizeInGb = Objects.requireNonNull(sizeInGb);
            return this;
        }
        public Builder sizeInGb(Integer sizeInGb) {
            this.sizeInGb = Output.of(Objects.requireNonNull(sizeInGb));
            return this;
        }
        public Builder tags(@Nullable Output<List<DiskTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<DiskTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(DiskTagArgs... tags) {
            return tags(List.of(tags));
        }        public DiskArgs build() {
            return new DiskArgs(addOns, availabilityZone, diskName, sizeInGb, tags);
        }
    }
}
