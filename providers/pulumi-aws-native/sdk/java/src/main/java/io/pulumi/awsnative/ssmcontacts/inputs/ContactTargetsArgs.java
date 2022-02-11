// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmcontacts.inputs;

import io.pulumi.awsnative.ssmcontacts.inputs.ContactChannelTargetInfoArgs;
import io.pulumi.awsnative.ssmcontacts.inputs.ContactTargetInfoArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContactTargetsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContactTargetsArgs Empty = new ContactTargetsArgs();

    @InputImport(name="channelTargetInfo")
    private final @Nullable Input<ContactChannelTargetInfoArgs> channelTargetInfo;

    public Input<ContactChannelTargetInfoArgs> getChannelTargetInfo() {
        return this.channelTargetInfo == null ? Input.empty() : this.channelTargetInfo;
    }

    @InputImport(name="contactTargetInfo")
    private final @Nullable Input<ContactTargetInfoArgs> contactTargetInfo;

    public Input<ContactTargetInfoArgs> getContactTargetInfo() {
        return this.contactTargetInfo == null ? Input.empty() : this.contactTargetInfo;
    }

    public ContactTargetsArgs(
        @Nullable Input<ContactChannelTargetInfoArgs> channelTargetInfo,
        @Nullable Input<ContactTargetInfoArgs> contactTargetInfo) {
        this.channelTargetInfo = channelTargetInfo;
        this.contactTargetInfo = contactTargetInfo;
    }

    private ContactTargetsArgs() {
        this.channelTargetInfo = Input.empty();
        this.contactTargetInfo = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactTargetsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ContactChannelTargetInfoArgs> channelTargetInfo;
        private @Nullable Input<ContactTargetInfoArgs> contactTargetInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactTargetsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelTargetInfo = defaults.channelTargetInfo;
    	      this.contactTargetInfo = defaults.contactTargetInfo;
        }

        public Builder setChannelTargetInfo(@Nullable Input<ContactChannelTargetInfoArgs> channelTargetInfo) {
            this.channelTargetInfo = channelTargetInfo;
            return this;
        }

        public Builder setChannelTargetInfo(@Nullable ContactChannelTargetInfoArgs channelTargetInfo) {
            this.channelTargetInfo = Input.ofNullable(channelTargetInfo);
            return this;
        }

        public Builder setContactTargetInfo(@Nullable Input<ContactTargetInfoArgs> contactTargetInfo) {
            this.contactTargetInfo = contactTargetInfo;
            return this;
        }

        public Builder setContactTargetInfo(@Nullable ContactTargetInfoArgs contactTargetInfo) {
            this.contactTargetInfo = Input.ofNullable(contactTargetInfo);
            return this;
        }

        public ContactTargetsArgs build() {
            return new ContactTargetsArgs(channelTargetInfo, contactTargetInfo);
        }
    }
}
