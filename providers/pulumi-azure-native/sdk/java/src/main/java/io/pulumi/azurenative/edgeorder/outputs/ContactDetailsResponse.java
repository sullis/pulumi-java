// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContactDetailsResponse {
    /**
     * Contact name of the person.
     * 
     */
    private final String contactName;
    /**
     * List of Email-ids to be notified about job progress.
     * 
     */
    private final List<String> emailList;
    /**
     * Mobile number of the contact person.
     * 
     */
    private final @Nullable String mobile;
    /**
     * Phone number of the contact person.
     * 
     */
    private final String phone;
    /**
     * Phone extension number of the contact person.
     * 
     */
    private final @Nullable String phoneExtension;

    @OutputCustomType.Constructor({"contactName","emailList","mobile","phone","phoneExtension"})
    private ContactDetailsResponse(
        String contactName,
        List<String> emailList,
        @Nullable String mobile,
        String phone,
        @Nullable String phoneExtension) {
        this.contactName = Objects.requireNonNull(contactName);
        this.emailList = Objects.requireNonNull(emailList);
        this.mobile = mobile;
        this.phone = Objects.requireNonNull(phone);
        this.phoneExtension = phoneExtension;
    }

    /**
     * Contact name of the person.
     * 
    */
    public String getContactName() {
        return this.contactName;
    }
    /**
     * List of Email-ids to be notified about job progress.
     * 
    */
    public List<String> getEmailList() {
        return this.emailList;
    }
    /**
     * Mobile number of the contact person.
     * 
    */
    public Optional<String> getMobile() {
        return Optional.ofNullable(this.mobile);
    }
    /**
     * Phone number of the contact person.
     * 
    */
    public String getPhone() {
        return this.phone;
    }
    /**
     * Phone extension number of the contact person.
     * 
    */
    public Optional<String> getPhoneExtension() {
        return Optional.ofNullable(this.phoneExtension);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contactName;
        private List<String> emailList;
        private @Nullable String mobile;
        private String phone;
        private @Nullable String phoneExtension;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactName = defaults.contactName;
    	      this.emailList = defaults.emailList;
    	      this.mobile = defaults.mobile;
    	      this.phone = defaults.phone;
    	      this.phoneExtension = defaults.phoneExtension;
        }

        public Builder setContactName(String contactName) {
            this.contactName = Objects.requireNonNull(contactName);
            return this;
        }

        public Builder setEmailList(List<String> emailList) {
            this.emailList = Objects.requireNonNull(emailList);
            return this;
        }

        public Builder setMobile(@Nullable String mobile) {
            this.mobile = mobile;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = Objects.requireNonNull(phone);
            return this;
        }

        public Builder setPhoneExtension(@Nullable String phoneExtension) {
            this.phoneExtension = phoneExtension;
            return this;
        }
        public ContactDetailsResponse build() {
            return new ContactDetailsResponse(contactName, emailList, mobile, phone, phoneExtension);
        }
    }
}