package vn.edu.usth.ircproject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabsAccessorAdapter extends FragmentStatePagerAdapter {


    public TabsAccessorAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int i) {
// Create a switch
        switch (i)
        {
            case 0:
                ChatsFragment chatsFragment = new ChatsFragment();
                return chatsFragment;
            case 1:
                groupsFragment groupsFragment = new groupsFragment();
                return groupsFragment;
            case 2:
                ContactsFragment contactsFragment = new ContactsFragment();
                return contactsFragment;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 3;
    }


    @Nullable
    @Override
//Set the tittle
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0:
                return "Chat";
            case 1:
                return "Groups";
            case 2:
                return "Contacts    ";
            default:
                return null;
        }

    }
}
