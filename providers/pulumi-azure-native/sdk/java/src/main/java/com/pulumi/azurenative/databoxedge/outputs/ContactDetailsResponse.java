// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ContactDetailsResponse {
    /**
     * @return The name of the company.
     * 
     */
    private final String companyName;
    /**
     * @return The contact person name.
     * 
     */
    private final String contactPerson;
    /**
     * @return The email list.
     * 
     */
    private final List<String> emailList;
    /**
     * @return The phone number.
     * 
     */
    private final String phone;

    @CustomType.Constructor
    private ContactDetailsResponse(
        @CustomType.Parameter("companyName") String companyName,
        @CustomType.Parameter("contactPerson") String contactPerson,
        @CustomType.Parameter("emailList") List<String> emailList,
        @CustomType.Parameter("phone") String phone) {
        this.companyName = companyName;
        this.contactPerson = contactPerson;
        this.emailList = emailList;
        this.phone = phone;
    }

    /**
     * @return The name of the company.
     * 
     */
    public String companyName() {
        return this.companyName;
    }
    /**
     * @return The contact person name.
     * 
     */
    public String contactPerson() {
        return this.contactPerson;
    }
    /**
     * @return The email list.
     * 
     */
    public List<String> emailList() {
        return this.emailList;
    }
    /**
     * @return The phone number.
     * 
     */
    public String phone() {
        return this.phone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String companyName;
        private String contactPerson;
        private List<String> emailList;
        private String phone;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.companyName = defaults.companyName;
    	      this.contactPerson = defaults.contactPerson;
    	      this.emailList = defaults.emailList;
    	      this.phone = defaults.phone;
        }

        public Builder companyName(String companyName) {
            this.companyName = Objects.requireNonNull(companyName);
            return this;
        }
        public Builder contactPerson(String contactPerson) {
            this.contactPerson = Objects.requireNonNull(contactPerson);
            return this;
        }
        public Builder emailList(List<String> emailList) {
            this.emailList = Objects.requireNonNull(emailList);
            return this;
        }
        public Builder emailList(String... emailList) {
            return emailList(List.of(emailList));
        }
        public Builder phone(String phone) {
            this.phone = Objects.requireNonNull(phone);
            return this;
        }        public ContactDetailsResponse build() {
            return new ContactDetailsResponse(companyName, contactPerson, emailList, phone);
        }
    }
}
